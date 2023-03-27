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
 * @author Thethwayo96
 */
public class TestChoiceServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String testChoice = request.getParameter("testChoice");
        int numQuestions =5;
        int count =0;
        int numCorrectAns =0;
        
        session.setAttribute("testChoice",testChoice);
        session.setAttribute("numQuestions",numQuestions);
        session.setAttribute("count",count);
        session.setAttribute("numCorrectAns",numCorrectAns);
        
        RequestDispatcher disp = request.getRequestDispatcher("testConfirmation.jsp");
        disp.forward(request, response);
    }
}
