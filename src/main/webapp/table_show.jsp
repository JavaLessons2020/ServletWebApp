<%--
  Created by IntelliJ IDEA.
  User: Evgeniy
  Date: 02.12.2020
  Time: 19:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<% int num = (int) request.getAttribute("num"); %>
<p>Таблица цмножения на <%=num%>
</p>
<div><% for (int i = 1; i <= 10; i++) {
    out.println("<div>" + num + " * " + i + " = " + (num * i) +"</div>");
} %></div>

<a href="/table_jsp">back</a>
</body>
</html>
