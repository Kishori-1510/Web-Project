package com.mvc_example.controller;

import com.mvc_example.model.DAOserviseImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;

@WebServlet("/delete")
public class deleteController extends HttpServlet {

    public deleteController() {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String email= req.getParameter("email");
        DAOserviseImpl servise=new DAOserviseImpl();
        servise.connectDB();
        servise.deleteRegistration(email);
        ResultSet result = servise.getAllRegistration();
        req.setAttribute("result" , result);
        RequestDispatcher rd= req.getRequestDispatcher("/WEB-INF/views/list_resgitrations.jsp");

        rd.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
