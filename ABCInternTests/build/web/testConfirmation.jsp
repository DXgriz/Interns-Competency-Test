<%-- 
    Document   : testConfirmation
    Created on : Mar 21, 2023, 11:04:20 PM
    Author     : Ngcobo VS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Test Confirm Page</title>
    </head>
    <body>
        <h1>Test Confirmation</h1>
        <%
            String name =session.getAttribute("name").toString();
            String testChoice = session.getAttribute("testChoice").toString();
            int numQuestions = Integer.parseInt(session.getAttribute("numQuestions").toString());
        %>
        <p>
            <b><%=name%></b>, you have chosen to take the <b><%=testChoice%></b>.
            We have <b><%=numQuestions%></b> questions for you. <br><br>
            <a href="QuestionGeneratorServlet.do">START</a>
        </p>
    </body>
</html>
