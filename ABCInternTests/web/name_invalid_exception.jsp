<%-- 
    Document   : name_invalid_exception
    Created on : 27 Mar 2023, 11:18:25
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error Page</title>
    </head>
    <body>
        <%
            String message = session.getAttribute("noNameMessage").toString();
        %>
        <h1>invalid name entered</h1>
        <p>
            <%=message%>,<br>

            <a href="index.html">BACK</a>   
        </p>
    </body>
</html>
