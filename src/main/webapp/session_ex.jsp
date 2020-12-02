<%--
  Created by IntelliJ IDEA.
  User: Evgeniy
  Date: 02.12.2020
  Time: 20:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ page import="org.itstep.model.Student" %>
<html>
<head>
    <title>Session</title>
</head>
<body>

<%Student student = (Student) session.getAttribute("student");%>

<%--<p> Наша сессия = <%= session.getAttribute("data")%></p>--%>
<p> Наша сессия = ${data}</p>

<p>Наш студент</p>
<p>Имя: <%= student.getName()%></p>
<p>Возраст: <%= student.getAge()%></p>
<p>Телефон: ${student.phone}</p>


</body>
</html>
