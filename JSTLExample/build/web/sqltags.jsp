<%-- 
    Document   : sqltags
    Created on : 25-Aug-2023, 8:30:53 am
    Author     : vikram
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SQL Tags</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    </head>
    <body>
        <h1>SQL Tags</h1>
        <h3>All data is below:</h3>
        <sql:setDataSource driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/registration" user="root" password="" var="ds"></sql:setDataSource>
        <sql:query dataSource="${ds}" var="rs">select * from user;</sql:query>

            <div class="container">
                <table class="table">
                    <tr>
                        <td>User id</td>
                        <td>Name</td>
                        <td>Email</td>
                    </tr>

                <c:forEach items="${rs.rows}" var="row">
                    <tr>
                        <td><c:out value="${row.id}"></c:out></td>
                        <td><c:out value="${row.name}"></c:out></td>
                        <td><c:out value="${row.email}"></c:out></td>
                        </tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>
