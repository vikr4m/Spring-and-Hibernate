<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Help</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
  </head>
  <body>
  	<%@include file= "navbar.jsp" %>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    <h1 class="text-center">Help Page</h1>
    
    <% 
    	/* String name = (String)request.getAttribute("name");
    	Integer rollno = (Integer)request.getAttribute("rollno");
    	LocalDateTime time =(LocalDateTime) request.getAttribute("time"); */
    
    %>
    
    <h1>Hello my name is 
    	<%-- <%=name %> --%>
    	${name}</h1>
    <h1>My roll no is 
    	<%-- <%=rollno %> --%>
    	${rollno}</h1>
    <h2>Date and time is
    	<%--  <%=time %> --%>
    	${time}</h2>
    	
    <hr>
    	<c:forEach var="item" items="${marks}">
    		<h1>${item}</h1>
    	</c:forEach>
    	
    	
    	
    	
    
</body>
</html>