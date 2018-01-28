<%--
  Created by IntelliJ IDEA.
  User: farruhhabibullaev
  Date: 1/28/18
  Time: 3:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>My Music Store<</title>
    <link rel="stylesheet" href="style/css/main.css" type="text/css">
</head>
<body>

<h1>Downloads</h1>
<h2>86 (the band) - True Life Songs and Pictures</h2>

<table>
    <tr>
        <th>Song Title</th>
        <th>Audio Format</th>
    </tr>
    <tr>
        <td>You are a star</td>
        <td>
            <a href="/sound/${productCode}/star.mp3">MP3</a>
        </td>
    </tr>
    <tr>
        <td>Don't Make No Difference</td>
        <td>
            <a href="sound/${productCode}/no_difference.mp3">MP3</a>
        </td>
    </tr>
</table>
</body>
</html>
