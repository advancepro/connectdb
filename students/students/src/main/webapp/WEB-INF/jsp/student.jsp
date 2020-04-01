<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<title>Student details</title>
<body>
<table>
    <tr>
        <th>Field</th>
        <th>Value</th>
    </tr>
    <tr>
        <td>ID:</td>
        <td>${student.id}</td>
    </tr>
    <tr>
        <td>First name:</td>
        <td>${student.firstName}</td>
    </tr>
    <tr>
        <td>Last name:</td>
        <td>${student.lastName}</td>
    </tr>
    <tr>
        <td>Company:</td>
        <td>${student.groupName}</td>
    </tr>
</table>
</body>
</html>