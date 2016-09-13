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
    <%--<form:label path="name" > <c:out value="${user.name}" /> </form:label>--%>
    <form:input path="name" id="name"  placeholder="Jane Doe" maxlength="255" size="100"  readonly="true"/>
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

    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
    <input type="submit">
</form:form>
<form:form id="no"   method="POST" action="/user/createAccount" >

    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
    <button type="submit" name="No"> No </button>

</form:form>


</body>
</html>