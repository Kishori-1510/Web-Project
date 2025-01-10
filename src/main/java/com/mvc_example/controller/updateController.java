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

@WebServlet("/update")
public class updateController extends HttpServlet {

    public updateController() {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String mobile= req.getParameter("mobile");
        String email= req.getParameter("email");

        req.setAttribute("mobile",mobile);
        req.setAttribute("email",email);

        RequestDispatcher rd= req.getRequestDispatcher("/WEB-INF/views/update_resgitrations.jsp");

        rd.forward(req,resp);



    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String mobile= req.getParameter("mobile");
        String email= req.getParameter("email");

        DAOserviseImpl service= new DAOserviseImpl();
        service.connectDB();
        service.updateRegistration(mobile,email);
        ResultSet result = service.getAllRegistration();
        req.setAttribute("result" , result);
        RequestDispatcher rd= req.getRequestDispatcher("/WEB-INF/views/list_resgitrations.jsp");

        rd.forward(req,resp);
    }
}
