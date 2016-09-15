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
    <th>User Id:
    <c:out value="${user.userId}" />
    </th>
    <br>
    <th>Admin Privileges:
    <c:if test="${user.admin== 'admin'}">
        admin privileges granted
    </c:if>
    </th>
    <br>
    <br>
    <th>Name of User:
        <c:out value="${user.name}" />
    </th>
    <br>
    <th>UserName:
        <c:out value="${user.userName}" />
    </th>
    <br>
    <th>User Password:
        <c:out value="${user.password}" />
    </th>
    <br>
        <c:out value="${user.email}"/>
    <br>
        <c:out value="${user.states}"/>
    <br>
        <c:out value="${user.city}" />
    <br>
        <c:out value="${user.zip}" />
    <br>
        <c:out value="${user.phone}" />
    <br>
        <c:out value="${user.ssn}" />
    <br>
    <br>
</tr>
</c:forEach>
<a href="/webUi/userPage"> Home </a>
</body>
</html>