<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>MyWebSite</title>
    <link rel="stylesheet" href="styles/style.css" type="text/css">
</head>
<body>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="cs320" uri="farruh.sqlgetway.com" %>
<c:if test="${sqlStatement == null}">
    <c:set var="sqlStatement" value="Select * from User"/>
</c:if>
<h1>The SQL Gateaway</h1>
<cs320:Add op1="12" op2="15"/>
<p>Enter an SQL statement and click the Execute button.</p>
<p><b>SQL statement:</b></p>

<form action="/sqlGateway" method="post">
    <textarea name="sqlStatement" cols="60" rows="8">${sqlStatement}</textarea>
    <input type="submit" value="Execute">
</form>

<p><b>SQL result:</b></p>
${sqlResult}
</body>
</html>
