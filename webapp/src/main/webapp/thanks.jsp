<%--
  Created by IntelliJ IDEA.
  User: farruhhabibullaev
  Date: 12/19/17
  Time: 10:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Thank you!</title>
    <link rel="stylesheet" href="styles/style.css" type="text/css">
</head>
<body>
<h1>Thanks for joining our email list</h1>
<p>Here is the information that you entered:</p>
<p>
    <c:if test="${user.email != null}">
        <p><i>${user.email}</i></p>
    </c:if>
</p>
<label>Email:</label>
<span>${user.email}</span><br>
<label>First Name:</label>
<span>${user.firstName}</span><br>
<label>Last Name:</label>
<span>${user.lastName}</span><br>

<p>To enter another email address, click on the back button in your browser or the Return button
    shown below.</p>

<form action="emailList" method="get">
    <input type="hidden" name="action" value="join">
    <input type="submit" value="Return">
</form>
</body>
</html>
