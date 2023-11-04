<%-- 
    Document   : page2
    Created on : 23-Aug-2023, 9:31:01 am
    Author     : vikram
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page 2</title>
    </head>
    <body>
        <h1>This is Page 2</h1>
        
        <%
            //redirection
            
            //response.sendRedirect("page3.jsp");
            response.sendRedirect("https://www.google.com/");
        %>
    </body>
</html>
