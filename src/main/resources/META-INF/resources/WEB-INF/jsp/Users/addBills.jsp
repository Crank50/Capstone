<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title> </title>

</head>
<body>
<h1>Load Bills</h1>

<form method="POST" enctype="multipart/form-data" action="/admin/saveUploadedQuestions">
    <table>
        <tr>
            <td>File to upload:</td>
            <td><input type="file" name="QuizQuestionsFile" /></td>
        </tr>
        <tr>
            <td><input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" /></td>
            <td><input type="submit" value="Upload" /></td>
        </tr>
    </table>
</form>

</body>
</html>