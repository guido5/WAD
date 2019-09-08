<%--
  Created by IntelliJ IDEA.
  User: avata
  Date: 07/09/2019
  Time: 11:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String encodeURL = response.encodeURL("/LaChicharronera_war_exploded/html/ResponseSaveServlet");
    out.println("<form action=\"" + encodeURL + "\" method=\"post\">");
%>
<input name="articulo0" type="checkbox">Articulo 1<br>
<input name="articulo1" type="checkbox">Articulo 2<br>
<input name="articulo2" type="checkbox">Articulo 3<br>
<input name="articulo3" type="checkbox">Articulo 4<br>
<input name="articulo4" type="checkbox">Articulo 5<br>
<input type="submit">
</form>
</body>
</html>
