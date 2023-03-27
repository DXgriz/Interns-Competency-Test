<%-- 
    Document   : question
    Created on : Mar 22, 2023, 8:14:05 PM
    Author     : Ngcobo VS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Question Page</title>
    </head>
    <body>
        <h1><b>Question</b></h1>
        <%
            int count = Integer.parseInt(session.getAttribute("count").toString());
            String question = session.getAttribute("question").toString();
        %>
        <p>
            Please see question below and provide an answer.
        </p>
        <form action="AnswerServlet.do" method="POST">
            <table>
                <tr>
                    <td><b>Question <%=count%>:</b></td>
                    <td>
                        <%=question%>
                    </td>
                </tr>
                <tr>
                    <td><b>Answer:</b></td>
                    <td><input type="text" name="userAnswer"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="Submit" value="SUBMIT"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
