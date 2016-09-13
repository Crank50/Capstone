<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title> </title>

</head>
<body>
<h1>View All Users</h1>
<c:forEach var="user" items="${users}">
<tr>
        <c:out value="${user.id}" />
    <br>
        <c:out value="${user.name}" />
    <br>
        <c:out value="${user.email}"/>
    <br>
        <c:out value="${user.city}" />
    <br>
        <c:out value="${user.zip}" />
    <br>
        <c:out value="${user.phone}" />
    <br>
        <c:out value="${user.ssn}" />
    <br>
        <c:out value="${user.userSince}" />
    <br>
</tr>
</c:forEach>
<a href="/webUi/userPage"> Home </a>
</body>
</html>