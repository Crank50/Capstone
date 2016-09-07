<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>WWAD Create Account </title>

</head>
<body>

<form:label path="name">Name: </form:label>
<form:input path="name" id="name" maxlength="30" size="100" />
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