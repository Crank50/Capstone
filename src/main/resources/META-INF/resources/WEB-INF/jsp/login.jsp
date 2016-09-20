<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Login</title>
    <link type="text/css" rel="stylesheet" href="/css/login.css"/>

</head>
<body>
<h1>LOGIN </h1>
<c:if test="${param.error != null}">
    <br><br><div style="color: red;">Invalid username and password.</div><br><br>
</c:if>
<c:if test="${!empty logout}">
    <br><br><div style="color: green;">You have been logged out.</div><br><br>
</c:if>
<form:form id="accountType" commandName="accountType" modelAttribute="accountType" action="/login" method="POST" >
    <form:label path="username">Enter UserName: </form:label>
    <form:input path="username" id="username"/>
    <br>

    <form:label path="password">Enter Password: </form:label>
    <form:input path="password" id="password"/>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <br>
    <br>
    <input type="submit" value="Sign In"/>
</form:form>

<a href="/webUi/userPage"> Home </a>
<a href="/user/createAccount">Create Account</a>
</body>
</html>
