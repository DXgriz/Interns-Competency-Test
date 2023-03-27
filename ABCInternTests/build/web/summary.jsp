<%-- 
    Document   : summary
    Created on : Mar 23, 2023, 1:26:02 AM
    Author     : Ngcobo VS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Results Page</title>
    </head>
    <body>
        <h1>Test results</h1>
        <%
            String name = session.getAttribute("name").toString();
            String testChoice = session.getAttribute("testChoice").toString();
            int numQuestions = Integer.parseInt(session.getAttribute("numQuestions").toString());
            int numCorrectAns = Integer.parseInt(session.getAttribute("numCorrectAns").toString());
            int wrongAnswers = numQuestions - numCorrectAns;
            double percentMark =((double)numCorrectAns / numQuestions)*100;
            String outcome;
            
            if (percentMark >= 70.0) {
                    outcome ="Congratulations, you have made it to interview stages.";
                } else {
                outcome ="You failed the competency test, try again.";
                }
        %>
                <p>
            Please see your Test Performance below:
        </p>
        <table>
                <tr>
                    <td><b>Name of candidate:</b></td>
                    <td>
                        <%=name%>
                    </td>
                </tr>
                <tr>
                    <td><b>Test chosen: </b></td>
                    <td><%=testChoice%></td>
                </tr>
                <tr>
                    <td><b>Total questions: </b> </td>
                    <td><%=numQuestions%></td>
                </tr>
                <tr>
                    <td><b>Total correct answers:  </b></td>
                    <td><%=numCorrectAns%></td>
                </tr>
                <tr>
                    <td><b>Total wrong answers:  </b></td>
                    <td><%=wrongAnswers%></td>
                </tr>
                <tr>
                    <td><b>Percentage Mark obtained:  </b></td>
                    <td><%=percentMark%></td>
                </tr>
                <tr>
                    <td><b>Status:  </b></td>
                    <td><%=outcome%></td>
                </tr>
                <tr>
                    <td></td>
                    <td><a href="EndSessionServlet.do">EXIT</a></td>
                </tr>
        </table>
    </body>
</html>
