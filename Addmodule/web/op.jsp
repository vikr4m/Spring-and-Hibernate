<%-- 
    Document   : op
    Created on : 21-Aug-2023, 11:07:07 am
    Author     : vikram
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="error_ex.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Divide Operation</title>
    </head>
    <body>
        <%
           String n1 = request.getParameter("n1");
           String n2 = request.getParameter("n2");
           
           int a = Integer.parseInt(n1);
           int b = Integer.parseInt(n2);
           
           int c = a/b;
        %>
        <h1>Result is <%= c%></h1>
    </body>
</html>
