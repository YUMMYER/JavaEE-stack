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

