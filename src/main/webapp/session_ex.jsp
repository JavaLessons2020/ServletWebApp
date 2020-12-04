<%--
  Created by IntelliJ IDEA.
  User: Evgeniy
  Date: 02.12.2020
  Time: 20:06
  To change this template use File | Settings | File Templates.
--%>

// Основные теги создания циклов, определения условий, вывода информации на страницу и т.д.
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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

<div style="color: chartreuse"><c:out value="${student.name}"/></div>
<div><c:if test="${student.age == 32}">
    <div style="color: red"><c:out value="Student age = ${student.age}"/></div>
</c:if></div>


<div>
    <c:forEach var="stu" items="${students}">
        <p>Наш студент</p>
        <p>Имя: ${stu.name}</p>
        <p>Возраст: ${stu.age}</p>
        <p>Телефон: ${stu.phone}</p>
        <p>================================</p>
    </c:forEach>
</div>

</body>
</html>
