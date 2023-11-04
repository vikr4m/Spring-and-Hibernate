<!<!-- Taglib directive 
  is used when we want to use other tag library in jstl JSP page.
  such as JSTL (JSP Tag Library) or custom library created by users.
-->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="errorhandling.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Taglib Page</title>
    </head>
    <body>
        
        <h1>Hello World!</h1><hr>
        <c:set var="name" value="vikram singh"></c:set>
        <c:out value="${name}"></c:out>
        
        <c:if test="${3>2}">
            <h2>If clause working true block</h2>
        </c:if>
        <%! 
            int n1 = 10;
            int n2 = 20;
            String content = null;
        %>
        <%
            int division = n2/n1;
        %>
        <h2><%= division%></h2>
        <%= content.length()%>
        
              
    </body>
</html>
