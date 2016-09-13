<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">

    <title>WWAD Create Account </title>

</head>
<body>
<h1>Create User</h1>


<form:form id="userForm" commandName="user" modelAttribute="user" method="POST" action="/user/userCreation" >
    <form:label path="name" >Name: </form:label>
<form:input path="name" id="name"  placeholder="Jane Doe" maxlength="255" size="100" />
    <br>
    <br>
    <form:label path="userName" >UserName: </form:label>
<form:input path="userName" id="userName"  placeholder="Desired UserName" maxlength="255" size="100" />
    <br>
    <br>

    <form:label path="password" >Password: </form:label>
<form:input path="password" id="password"  placeholder="Enter Password" maxlength="255" size="100" />
    <br>
    <br>   <form:label path="matchingPassword" >Confirm Password: </form:label>
<form:input path="matchingPassword" id="matchingPassword"  placeholder="Confirm Password" maxlength="255" size="100" />
    <br>
    <br>

    <form:label path="states">State:</form:label>
    <form:checkboxes path="states" id="states"><form:options  items="${STATES}" />
    </form:checkboxes>
    <br>
    <br>


    <form:label path="city" >City: </form:label>
<form:input path="city" id="city" placeholder="Salt Lake City" maxlength="255" size="100" />
    <br>
    <br>

    <form:label path="zip" >Zip: </form:label>
<form:input path="zip" id="zip" placeholder="84009" maxlength="255" size="100" />
    <br>
    <br>

    <form:label path="email" >Email: </form:label>
<form:input path="email" id="email"  placeholder="generic_email@gmail.com" maxlength="255" size="100" />
    <br>
    <br>

    <form:label path="phone" >Phone: </form:label>
<form:input path="phone" id="phone"  placeholder="1112223333" maxlength="255" size="100"  />
    <br>
    <br>

    <form:label path="ssn" >SSN: </form:label>
<form:input path="ssn"  id="ssn"  placeholder="777119999" maxlength="255" size="100" />
    <br>
    <br>


    <form:label path="admin" >Admin # --optional--: </form:label>
<form:input path="admin" id="admin" placeholder="Requires Special Key" maxlength="255" size="100" />

    <br>
    <br>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
    <input type="submit">

</form:form>

</body>
</html>