<%--
  Created by IntelliJ IDEA.
  User: avata
  Date: 03/09/2019
  Time: 08:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="../CSS/HomePage.css">
    <title>Ventas Con Cookies</title>
</head>
<body>
<form action="CookiesSaveServlet" method="get">
    <%
        Cookie[] galletas = request.getCookies();
        for (int i=0; i<5; i++) {
            try {
                String isActiveCheckBox = (String) galletas[i].getValue();
                if (isActiveCheckBox.equals("on")) {
                    out.print("<input name=\"articulo" + i + "\" type=\"checkbox\" checked=\""+isActiveCheckBox+"\">Articulo " + i + "<br>");
                } else {
                    out.print("<input name=\"articulo" + i + "\" type=\"checkbox\">Articulo " + i + "<br>");
                }
            } catch (Exception e) {
                out.print("<input name=\"articulo" + i + "\" type=\"checkbox\">Articulo " + i + "<br>");
            }
        }
        out.print("<input type=\"submit\"><br>");
    %>
</form>
</body>
</html>
