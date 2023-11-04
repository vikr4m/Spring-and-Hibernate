<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!-- Directives in JSP
1. Page Directive
2. Include Directive
3. Taglib Directive-->

<%@page import= "java.util.Random,java.util.ArrayList,java.io.*"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Directive Page</title>
        <style>
            div{
            margin:0px;
            padding: 0;
            }
        </style>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <h1>Random number: 
            <% 
                Random r = new Random();
                int n = r.nextInt(30);
                out.println(n);
            %></h1>
    </body>
</html>
