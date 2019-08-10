<%--
  Created by IntelliJ IDEA.
  User: minhnt-mac
  Date: 2019-08-10
  Time: 19:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>Add Phone</title>
</head>
<body>
<form action="/phone/add" method="post">
    <div class="form-group">
        <label for="name">Phone Name</label>
        <input type="name" class="form-control" name="name" id="name" placeholder="Name">
    </div>
    <div class="form-group">
        <label for="branch">Branch</label>
        <select class="form-control"name="branch" id="branch">
            <option>Apple</option>
            <option>Samsung</option>
            <option>Nokia</option>
            <option>Orther</option>
        </select>
    </div>
    <div class="form-group">
        <label for="price">Price</label>
        <input type="text" class="form-control" name="price" id="price" placeholder="Price">
    </div>
    <div class="form-group">
        <label for="description">Another label</label>
        <input type="text" class="form-control" name="description" id="description" placeholder="Desprition">
    </div>
    <button type="reset" class="btn btn-primary">Reset</button>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>


</body>
</html>
