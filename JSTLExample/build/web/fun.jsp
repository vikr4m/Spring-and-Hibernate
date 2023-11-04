<%-- 
    Document   : fun
    Created on : 25-Aug-2023, 8:17:20 am
    Author     : vikram
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Functions tags</title>
    </head>
    <body>
        <c:set var="name" value="Vikram Singh"></c:set>
        <h1><c:out value="${name}"></c:out></h1>
        
        <h1><c:out value="${fn:length(name)}"></c:out></h1>     <!-- String length function -->
        <h1><c:out value="${fn:toLowerCase(name)}"></c:out></h1>    <!-- to lower case functions -->
        <h1><c:out value="${fn:contains(name,'Singh')}"></c:out></h1>   <!-- contains functions (case sensitive) -->
    </body>
</html>
