package com.mvc_example.controller;

import com.mvc_example.model.Add;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/mvcExample")
public class AddControllerServlet extends HttpServlet {
    public AddControllerServlet() {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        String name=req.getParameter("name");
        String  lastName=req.getParameter("lastName");
        Add a1= new Add();
        int result = a1.addNumber(num1, num2);
        String MYname=a1.ConcatName(name,lastName);
       req.setAttribute("res",result);
       req.setAttribute("Name",MYname);

      RequestDispatcher rd= req.getRequestDispatcher("first.jsp");
      rd.forward(req,resp);



    }
}
