<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World of Maven!</h2>
<p> The current time  right now is <%= new Date() %> </p>
<p>
    <% for (int i = 0; i < 5 ; i++){
        out.println("<br/> Counting this ever + " +i);
    }%>
</p>

<%! String toLowerCase(String string){
    return string.toLowerCase();
}%>

Convert it into lower case: <%=toLowerCase("Hello World") %>

Request object <%= request.getHeader("User-Agent") %>
locale: <%= request.getLocale() %>
</body>
</html>
