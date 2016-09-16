<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title> View Users </title>
    <link type="text/css" rel="stylesheet" href="/css/adminPage.css"/>


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
    <th>User UserName:
        <c:out value="${user.userName}" />
    </th>
    <br>
    <th>User Password:
        <c:out value="${user.password}" />
    </th>
    <br>
    <th>User Email:
        <c:out value="${user.email}"/>
    </th>
    <br>
    <th>User State:
        <c:out value="${user.states}"/>
    </th>
    <br>
    <th>User City:
        <c:out value="${user.city}" />
    </th>
    <br>
    <th>User Zip:
        <c:out value="${user.zip}" />
    </th>
    <br>
    <th>User Phone:
        <c:out value="${user.phone}" />
    </th>
    <br>
    <th>User SSN:
        <c:out value="${user.ssn}" />
    </th>
    <br>
    <br>
</tr>
</c:forEach>
<a href="/webUi/userPage"> Home </a>
</body>
</html>