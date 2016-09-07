<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>WWAD Create Account </title>

</head>
<body>

<form:form id="userForm" commandName="user" method="POST" action="/user/saveNewUser" >
<form:label path="name" modelAttribute="name">Name: </form:label>
<form:input path="name" id="name" maxlength="255" size="100" />
</form:form>
-----form----
name
state, city, zip
email
phone
SSN
admin # optional
submit
---------------
<h1></h1>

</body>
</html>