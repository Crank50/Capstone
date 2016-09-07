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
    <br>
    <br>

    <form:label path="states">State:</form:label>
    <form:select path="states" id="states">
        <form:options items="${STATES}" />
    </form:select>
    <br>
    <br>


    <form:label path="city" >City: </form:label>
<form:input path="city" id="city" maxlength="255" size="100" />
    <br>
    <br>

    <form:label path="zip" >Zip: </form:label>
<form:input path="zip" id="zip" maxlength="255" size="100" />
    <br>
    <br>

    <form:label path="email" >Email: </form:label>
<form:input path="email" id="email" maxlength="255" size="100" />
    <br>
    <br>

    <form:label path="phone" >Phone: </form:label>
<form:input path="phone" id="phone" maxlength="255" size="100" />
    <br>
    <br>

    <form:label path="ssn" >SSN: </form:label>
<form:input path="ssn" id="ssn" maxlength="255" size="100" />
    <br>
    <br>

    <form:label path="admin" >Admin # --optional--: </form:label>
<form:input path="admin" id="admin" maxlength="255" size="100" />
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