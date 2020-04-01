<%--
  Created by IntelliJ IDEA.
  User: snowleopard
  Date: 3/22/18
  Time: 5:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Students page</title>
</head>
<body>
<table>
    <tr>
        <th>id</th>
        <th>Firstname</th>
        <th>Lastname</th>
        <th>Groupname</th>
    </tr>
    <c:forEach items="${students}" var="student">
        <tr>
            <td>${student.id}</td>
            <td>${student.firstName}</td>
            <td>${student.lastName}</td>
            <td>${student.groupName}</td>
            <td><a href="/getStudent?id=${student.id}">View details</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
