<%--
  Created by IntelliJ IDEA.
  User: Evgeniy
  Date: 27.11.2020
  Time: 20:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Login info</h1>
<%--<% Скриплеты  %>--%>
<h2>login:<%= request.getAttribute("login")%></h2>
<h2>Password:<%= request.getAttribute("password")%>
</h2>
</body>
</html>
