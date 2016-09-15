<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title> New User</title>

</head>
<body>
<h1>User Creation</h1>
<p>Is this information correct?</p>
<form:form id="userConfirmation"  modelAttribute="user" commandName="user" method="POST" action="/user/saveNewUser" >

    <c:if test="${user.admin== 'admin'}">
     admin privileges granted
</c:if>
    <br>
    <br>
    <c:if test="${user.password != user.matchingPassword}">
        passwords must match
</c:if>

<br>
    <%--<form:label path="name" > <c:out value="${user.name}" /> </form:label>--%>
    <form:input path="name" id="name"  placeholder="Jane Doe" maxlength="255" size="100" />
    <br>
    <br>
    <form:input path="userName" id="userName"  placeholder="Desired UserName" maxlength="255" size="100" />
    <br>
    <br>
    <form:input path="password" id="password"  placeholder="Enter Password" maxlength="255" size="100" />
    <br>
    <br>
    <form:input path="matchingPassword" id="matchingPassword"  placeholder="Confirm Password" maxlength="255" size="100" />
    <br>
    <br>
    <form:input path="states" id="states"  maxlength="255" size="100" />
    <br>
    <br>


    <form:input path="city" id="city" placeholder="Salt Lake City" maxlength="255" size="100" />
    <br>
    <br>
    <form:input path="zip" id="zip" placeholder="84009" maxlength="255" size="100" />
    <br>
    <br>

    <form:input path="email" id="email"  placeholder="generic_email@gmail.com" maxlength="255" size="100" />
    <br>
    <br>

    <form:input path="phone" id="phone"  placeholder="1112223333" maxlength="255" size="100"  />
    <br>
    <br>

    <form:input path="ssn"  id="ssn"  placeholder="777119999" maxlength="255" size="100" />
    <br>
    <br>

    <form:input path="admin" id="admin" placeholder="Requires Special Key" maxlength="255" size="100" />
    <br>
    <br>

    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
    <input type="submit">
</form:form>
<form:form id="no"   method="POST" action="/user/createAccount" >

    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
    <button type="submit" name="No"> No </button>

</form:form>


</body>
</html>