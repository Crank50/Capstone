<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login</title>
    <link type="text/css" rel="stylesheet" href="/css/login.css"/>

</head>
<body>
<c:if test="${param.error != null}">
    <br><br><div style="color: red;">Invalid username and password.</div><br><br>
</c:if>
<c:if test="${!empty logout}">
    <br><br><div style="color: green;">You have been logged out.</div><br><br>
</c:if>

<form action="<c:url value='/login'/>" method="POST">
    UserName:<br>
    <input type="text" name="username"/>
    <br>
    Password:<br>
    <input type="password" name="password"/>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <br>
    <br>
    <input type="submit" value="Sign In"/>
</form>
</body>
</html>
