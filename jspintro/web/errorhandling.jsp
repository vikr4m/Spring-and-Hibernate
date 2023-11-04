<%-- 
   Error Handling in JSP
   On this page we will learn how jsp handles error.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error</title>
        <style>
            *{
                padding:0px;
                margin:0px;
            }
        </style>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <div style="padding: 20px; color: red; background: lightcoral;">
            <h1>Sorry, something went wrong !!</h1><br>
            <p><%= exception%></p>
        </div>
    </body>
</html>
