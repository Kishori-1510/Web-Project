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
@WebServlet("/saveRegistration")
public class newRegistrationController extends HttpServlet {

    public newRegistrationController() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd= req.getRequestDispatcher("/WEB-INF/views/createRegistration.jsp");
        rd.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession(false);
        if(session.getAttribute("email")!=null) {
            String name = req.getParameter("name");
            String city = req.getParameter("city");
            String email = req.getParameter("email");
            String mobile = req.getParameter("mobile");

            DAOserviseImpl servise = new DAOserviseImpl();
            servise.connectDB();

            servise.saveRegistration(name, city, email, mobile);
            req.setAttribute("msg", "record added");
            RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/createRegistration.jsp");
            rd.forward(req, resp);
        }else{
            RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
            rd.forward(req, resp);
        }
    }
}
