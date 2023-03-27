package za.ac.wedowebapps.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.wedowebapps.business.NumberGenerator;
import za.ac.wedowebapps.business.QuestionsBank;
import za.ac.wedowebapps.business.TestManager;

/**
 *
 * @author Ngcobo VS
 */
public class QuestionGeneratorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String testChoice = session.getAttribute("testChoice").toString();
        int count = Integer.parseInt(session.getAttribute("count").toString());
        int num1, num2, correctAnswer;
        String question;
        
        NumberGenerator ng = new NumberGenerator();
        QuestionsBank qb = new QuestionsBank();
        TestManager tm = new TestManager();
        
        
        switch (testChoice) {
            case "addition":
                num1 = ng.generateNumber();
                num2 = ng.generateNumber();
                question = qb.additionTest(num1, num2);
                correctAnswer = tm.additionTestManager(num1, num2);
                count++;

                session.setAttribute("num1",num1);
                session.setAttribute("num2",num2);
                session.setAttribute("question",question);
                session.setAttribute("count",count);
                session.setAttribute("correctAnswer",correctAnswer);
                break;
            case "subtraction":
                num1 = ng.generateNumber();
                num2 = ng.generateNumber();
                question = qb.subtractionTest(num1, num2);
                correctAnswer = tm.subtractionTestManager(num1, num2);
                count++;

                session.setAttribute("num1",num1);
                session.setAttribute("num2",num2);
                session.setAttribute("question",question);
                session.setAttribute("count",count);
                session.setAttribute("correctAnswer",correctAnswer);
                break;
            case "division":
                num1 = ng.generateNumber();
                num2 = ng.generateNumber();
                question = qb.divisionTest(num1, num2);
                correctAnswer = tm.divisionTestManager(num1, num2);
                count++;

                session.setAttribute("num1",num1);
                session.setAttribute("num2",num2);
                session.setAttribute("question",question);
                session.setAttribute("count",count);
                session.setAttribute("correctAnswer",correctAnswer);
                break;
            case "multiplication":
                num1 = ng.multiplicationNumberGenerator();
                num2 = ng.multiplicationNumberGenerator();
                question = qb.multiplicationTest(num1, num2);
                correctAnswer = tm.multiplicationTestManager(num1, num2);
                count++;

                session.setAttribute("num1",num1);
                session.setAttribute("num2",num2);
                session.setAttribute("question",question);
                session.setAttribute("count",count);
                session.setAttribute("correctAnswer",correctAnswer);
                break;
        }

        RequestDispatcher disp = request.getRequestDispatcher("question.jsp");
        disp.forward(request, response);
    }
}
