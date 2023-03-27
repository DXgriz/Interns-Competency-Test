<%-- 
    Document   : outcome
    Created on : Mar 22, 2023, 9:13:53 PM
    Author     : Ngcobo VS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Outcome Page</title>
    </head>
    <body>
        <h1>Outcome</h1>
        <%
            String question = session.getAttribute("question").toString();
            int userAnswer = Integer.parseInt(request.getAttribute("userAnswer").toString());
            int correctAnswer =Integer.parseInt(session.getAttribute("correctAnswer").toString());
            String outcome = session.getAttribute("outcome").toString();
            int count = Integer.parseInt(session.getAttribute("count").toString());
            String url;

            if (count==5) {
                   url = "summary.jsp"; 
                } else {
                   url = "QuestionGeneratorServlet.do";
                }
        %>
        <p>
            Please see outcome below:
        </p>
        <table>
                <tr>
                    <td><b>Question:</b></td>
                    <td>
                        <%=question%>
                    </td>
                </tr>
                <tr>
                    <td><b>Your answer: </b></td>
                    <td><%=userAnswer%></td>
                </tr>
                <tr>
                    <td><b>Correct answer: </b> </td>
                    <td><%=correctAnswer%></td>
                </tr>
                <tr>
                    <td><b>outcome:  </b></td>
                    <td><%=outcome%></td>
                </tr>
                <tr>
                    <td></td>
                    <td><a href=<%=url%>>CONTINUE</a></td>
                </tr>
        </table>
    </body>
</html>
