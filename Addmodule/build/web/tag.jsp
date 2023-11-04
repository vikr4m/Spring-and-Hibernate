<%-- 
    Document   : tag
    Created on : 21-Aug-2023, 11:43:17 am
    Author     : vikram
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/tlds/mylib.tld" prefix="t"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <t:mytag></t:mytag>
        <t:printtable number = "12" color="blue"></t:printtable><br>
        <t:printtable number = "16" color="red"></t:printtable><br>
        <t:printtable number = "19" color="green"></t:printtable><br>
        
        <!--JSP Implicit Objects -->
        <%
//            out.println("");
//            request.getParameter("");
//            response.setParameter("");
//            
//            //config(ServletConfig);
//            
//            //application(ServletContext);
//            
//            //session
//            out.println(session.isNew());
//            session.setAttribute("name",23);
//            
//            //page: current jsp page:
//            
//            //exception: Throwable..
//            
//            //pageContext: PageContext
        %>
    </body>
</html>
