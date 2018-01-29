# JavaEE-stack
A stack of JavaEE demo projects including JDBC, JSP, Servlet, Hibernate, Spring and Struts. And small project for micro-services.

1. [JDBC (Java Database Connectivity)](https://github.com/farruhx/JavaEE-stack/tree/master/JDBC)
2. [Hibernate](https://github.com/farruhx/JavaEE-stack/tree/master/hibernate) 

# Note for myself
## Servlets

<pre>
    To forward requests:
    - getRequestDispatcher(url).forward(request,response)
    To redirect responses:
    - response.sendRedirect(url)
</pre>  

1. Context Param Elements;

 ` <context-param>
        <param-name>farruhx</param-name>
        <param-value>hxls</param-value>
  </context-param>`
  .getServletContext().getInitParameter()
  
2. Specific one inside servlet
   ` <init-param> </init-param>`
  .getServletConfig().getInitParameter()
  
<pre>
    To use EL
    - ${attribute.property}
    <%@ %> directive -  To set conditions that apply to the entire JSP.
    <% %> scriplet - To insert a block of java statement.
    <%= %> expression - To display the string value of an expression.
    
    To use Session
     - HTTP is stateless protocol
     - FTP is stateful protocol
    
     To get the session
     - HttpSession session = request.getSession();
     session.setAttribute("product",product);
    
     To remove an object
     - session.removeAttribute("code")
    
     General methods of session object
     -getAttributeNames();
     -getId();
     -isNew();
     -setMaxInactiveInterval(in seconds);
     -invalidate();
    
     Thread safe
     -final Object lock = request.getSession().getId().intern();
     synchronized(lock){
        cart = (Cart) session.getAttribute("cart");
     }
     
     To create cookie
     - Cookie(name, value);
     - setMaxAge(seconds);
     - setPath(path)
     - getName();
     - setName();
     - addCookie(cookie);
     - getCookies();
     ex. response.addCookie(c);
     
     To disable EL for single page
     <%a page isELIgnored = "true" %>
     
     For the entire application(web.xml file)
    
     <jsp-config>
        <jsp-property-group>
            <url-pattern>*.jsp</url-pattern>
            <el-ignored>true</el-ignored>
        <jsp-property-group>
     </jsp-config>
     
     To disable scripting
     
     <jsp-config>
        <jsp-property-group>
            <url-pattern>*.jsp</url-pattern>
            <scripting-invalid>true</script-invalid>
        </jsp-property-group>
     <jsp-config>    
</pre>

