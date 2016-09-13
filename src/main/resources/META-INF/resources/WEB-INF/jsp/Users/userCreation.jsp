<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title> New User</title>

</head>
<body>
<h1>User Creation</h1>
<form:form id="yes"  modelAttribute="user" commandName="user" method="POST" action="/user/saveNewUser" >

    <c:if test="${user.admin== 'admin'}">
     admin privileges granted
</c:if>
<br>
<c:out  value="${user.name}" />
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

    <button type="submit" name="Yes"> Yes </button>
</form:form>
<form:form id="no"   method="POST" action="/user/createAccount" >
    <button type="submit" name="No"> No </button>

</form:form>


</body>
</html>