<%-- 
    Document   : index
    Created on : 24-Aug-2023, 9:37:11 am
    Author     : vikram
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL Tags</title>
    </head>
    <body>
        <h1>This is JSTL Example</h1>
        <c:set var="i" value="0" scope="application"></c:set>  <!-- scope is used to set the scope of the defined variable-->
        
        <h1><c:out value="${i}"></c:out></h1>   <!-- alternative to expression tag i.e.-->
        
        
        <c:out value="${i}">This is the default value</c:out>
        <hr>
        
        <c:if test="${i==10}">      <!-- If test condition -->
            <h1>Yes i is 10 and condition is true</h1>
        </c:if>
            
        <c:choose>
            <c:when test="${i>0}">
                <h1>Positive number</h1>
            </c:when>
            <c:when test="${i<0}">
                <h1>Negative number</h1>
            </c:when>          
            <c:otherwise>
                <h1>Number is zero</h1>
            </c:otherwise>
           
        </c:choose>
                
        <c:forEach var="j" begin="1" end="10">      <!--loop-->
            <h2>Value of j: <c:out value="${j}"></c:out></h2>
        </c:forEach>
            
        <c:url var="myurl" value="https:www.google.com/search?">    <!-- url -->
            <c:param name="q" value="learn code"></c:param>
        </c:url>
        
        <c:out value="${myurl}"></c:out>
        
        <c:redirect url="${myurl}"></c:redirect>        <!-- redirect -->
        
        
    </body>
</html>
