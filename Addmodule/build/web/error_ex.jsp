<%-- 
    Document   : error_ex
    Created on : 21-Aug-2023, 11:14:16 am
    Author     : vikram
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    </head>
    <body>
        <div class="container p-3 text-center">
            <img src="img/error.png" class="img-fluid"/>
            <h1 class="display-3">Sorry, something went wrong</h1><br>
            <p><%= exception%></p>
            <a class="btn btn-outline-primary" href="index.html">Home page</a>
        </div>
    </body>
</html>
