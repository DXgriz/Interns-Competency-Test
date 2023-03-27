package za.ac.wedowebapps.controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.wedowebapps.business.ErrorHandler;
/**
 *
 * @author Ngcobo VS
 */
public class NameServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(true);
        String name =(String)request.getParameter("name");
        try {
            nameValidator(name);
            session.setAttribute("name", name);
            
            RequestDispatcher disp = request.getRequestDispatcher("start.jsp");
            disp.forward(request, response);
        } catch (ErrorHandler ex) {
            String noNameMessage =ex.getMessage();
            session.setAttribute("noNameMessage",noNameMessage);
             RequestDispatcher disp = request.getRequestDispatcher("name_invalid_exception.jsp");
             disp.forward(request, response);
        } 
    }
       private boolean nameIsNull(String name){
        boolean isNull =false;
        
        if (name.isEmpty()) {
            isNull =true;
        }
        return isNull;
    }
        public String nameValidator(String name)throws ErrorHandler{
        if (!nameIsNull(name)) {
           return name; 
        }else{
        throw new ErrorHandler("Enter a valid name!");}  
    } 
}
