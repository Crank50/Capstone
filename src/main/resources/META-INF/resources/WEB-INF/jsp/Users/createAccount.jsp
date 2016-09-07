<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>WWAD Create Account </title>

</head>
<body>
<h1>Create User</h1>


<form:form id="userForm" commandName="user" modelAttribute="user" method="POST" action="/user/saveNewUser" >
<form:label path="name" >Name: </form:label>
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

</body>
</html>