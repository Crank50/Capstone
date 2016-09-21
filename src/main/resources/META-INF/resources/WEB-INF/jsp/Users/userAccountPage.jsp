<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title> </title>

</head>
<body>
<h1>Welcome  <c:out value="${user.userName}" /></h1>
<a href="/webUi/userPage"> Home </a>
<a href="/admin/uploadBills">Add Bills</a>

</body>
</html>