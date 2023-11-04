<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <h1>First JSP Page</h1>
        <%!                         //declarative tag
            int a = 50;
            int b = 60;
            String name = "Vikram singh jadav";
            
            public int sum(){
                return a+b;
            }
            
            public String reverse(){
                StringBuffer sb = new StringBuffer(name);
                return sb.reverse().toString();
            }
        %>
        <%                          //scriplet tag
            out.println(a);
            out.println("<br>");
            out.println(b);
            out.println("<br>");
            out.println(sum());
            out.println("<br>");
            out.println(reverse());
        %>
        
        <h1 style="color: red">Sum: <%= sum() %></h1> <!-- expressive tag-->
        <h1><%=name%></h1>
    </body>
</html>
