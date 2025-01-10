package com.mvc_example.controller;

import com.mvc_example.model.DAOserviseImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebServlet("/verifyRegistration")
public class loginController extends HttpServlet {
    public loginController() {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String email= req.getParameter("email");
      String password= req.getParameter("password");

        DAOserviseImpl servise= new DAOserviseImpl();
        servise.connectDB();

       boolean status= servise.verifyLogin(email,password);

       if (status){
           HttpSession session= req.getSession(true);
           session.setAttribute("email",email);
           RequestDispatcher rd= req.getRequestDispatcher("/WEB-INF/views/createRegistration.jsp");
           rd.forward(req,resp);
       }else {
           req.setAttribute("error","Invalid password or mail");
           RequestDispatcher rd= req.getRequestDispatcher("login.jsp");
           rd.forward(req,resp);
       }

    }
}
