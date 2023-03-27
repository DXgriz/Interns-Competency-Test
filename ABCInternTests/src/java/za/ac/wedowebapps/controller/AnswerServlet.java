package za.ac.wedowebapps.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ngcobo VS
 */
public class AnswerServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        int userAnswer = Integer.parseInt(request.getParameter("userAnswer"));
        int correctAnswer =Integer.parseInt(session.getAttribute("correctAnswer").toString());
        int numCorrectAns = Integer.parseInt(session.getAttribute("numCorrectAns").toString());
        String outcome;
        
                if (userAnswer == correctAnswer) {
                    outcome = "Correct";
                    numCorrectAns++;
                    
                    request.setAttribute("userAnswer", userAnswer);
                    session.setAttribute("numCorrectAns", numCorrectAns);
                    session.setAttribute("outcome",outcome);
                } else {
                    outcome = "incorrect";
                    request.setAttribute("userAnswer", userAnswer);
                    session.setAttribute("numCorrectAns", numCorrectAns);
                    session.setAttribute("outcome",outcome);
                }
     
        RequestDispatcher disp = request.getRequestDispatcher("outcome.jsp");
        disp.forward(request, response);        
    }
}
