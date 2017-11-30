<%@page import="me.farruhhabibullaev.edu.javatpoint.dao.UserDao"%>
<jsp:useBean id="obj" class="me.farruhhabibullaev.edu.javatpoint.domain.User">
</jsp:useBean>
<jsp:setProperty property="*" name="obj"/>

<%
    int i=UserDao.register(obj);
    if(i>0)
        System.out.println("You are successfully registered");

%>