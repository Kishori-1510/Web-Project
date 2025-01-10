package com.mvc_example.controller;

import com.mvc_example.model.DAOservise;
import com.mvc_example.model.DAOserviseImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;

@WebServlet("/listAll")
public class listAllRegistration extends HttpServlet {
    public listAllRegistration() {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DAOserviseImpl service= new DAOserviseImpl();
        service.connectDB();
        ResultSet result = service.getAllRegistration();
        req.setAttribute("result" , result);
        RequestDispatcher rd= req.getRequestDispatcher("/WEB-INF/views/list_resgitrations.jsp");

        rd.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
