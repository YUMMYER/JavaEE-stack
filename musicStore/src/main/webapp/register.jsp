<%--
  Created by IntelliJ IDEA.
  User: farruhhabibullaev
  Date: 1/28/18
  Time: 3:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <head>
        <meta charset="utf-8">
        <title>My Music Store</title>
        <link rel="stylesheet" href="style/css/main.css" type="text/css">
    </head>
</head>
<body>
<h1>Download registration</h1>
<p> To Register for our downloads, enter your name and email address below. Then, click
    on the submit button.</p>

<form action="download" method="post">
    <input type="hidden" name="action" value="registerUser">
    <label class="pad_class">Email:</label>
    <input type="email" name="email" value="${user.email}"/><br/>
    <label class="pad_class">First Name:</label>
    <input type="text" name="firstName" value="${user.firstName}"><br/>
    <label class="pad_top">Last Name:</label>
    <input type="text" name="lastName" value="${user.lastName}"><br/>
    <label>&nbsp;</label>
    <input type="submit" value="Register" class="margin_left">
</form>
</body>
</html>
