<%--@elvariable id="person" type="org.itstep.model.Person"--%>
<%--<jsp:useBean id="person" scope="request" type="org.itstep.model.Person"/>--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--импортруем обьект Person--%>
<%@ page import="org.itstep.model.Person" %>
<html>
<head>
    <title>Person</title>
</head>
<body>

<% Person person1 = (Person)request.getAttribute("person");%>

<p><strong>Id: <%= ((Person)request.getAttribute("person")).getId()%></strong></p>
<p><strong>Name:<%= person1.getName()%> </strong></p>
<%--<p><strong>Email:<%= ((Person)request.getAttribute("person")).getEmail()%> </strong></p>--%>
<p><strong>Email: ${person.email} </strong></p>
</body>
</html>
