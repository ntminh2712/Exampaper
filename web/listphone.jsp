<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="entity.Phone" %>
<%--
  Created by IntelliJ IDEA.
  User: minhnt-mac
  Date: 2019-08-10
  Time: 19:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table style="width:100%">
    <tr>
        <th>Name</th>
        <th>Price</th>
        <th>Brand</th>
        <th>Description</th>
    </tr>
    <c:forEach var="phone" items="${listPhone}">
        <tr>
            <td>${phone.name}</td>
            <td>${phone.price}</td>
            <td>${phone.brand}</td>
            <td>${phone.description}</td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
