<html>
<head>
<title>JAVABEAN</title>
</head>
<body bgcolor="#ffffff">
<%@ page import="java.sql.*" %>
<jsp:useBean id="manejador" scope="session" class="paquete.DB"></jsp:useBean>
<%
ResultSet rs=null;
manejador.setConnection("com.mysql.jdbc.Driver","jdbc:mysql://localhost/BaseLoginServlet");
rs=manejador.executeQuery("SELECT Users.password FROM Users WHERE Users.id='Abraham1'");
if(rs.next())
out.println(rs.getString("Users.password"));
manejador.closeConnection();
%>
</body>
</html>