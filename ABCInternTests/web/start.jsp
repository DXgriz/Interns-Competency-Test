<%-- 
    Document   : start
    Created on : Mar 21, 2023, 10:43:54 PM
    Author     : Ngcobo VS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Start Page</title>
    </head>
    <body>
        <h1>Start</h1>
        <%
            String name =(String)session.getAttribute("name");
        %>
        <p>
            Hello <b><%=name%></b>. Please select below the numeracy test you want to take.
        </p>
        <form action="TestChoiceServlet.do" method="POST">
            <table>
                <tr>
                    <td>Test choice:</td>
                    <td>
                        <select name="testChoice">
                            <option value="addition">Addition</option>
                            <option value="subtraction">Subtraction</option>
                            <option value="division">Division</option>
                            <option value="multiplication">Multiplication</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="Submit" value="SUBMIT"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
