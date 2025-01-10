package p1;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/first")
public class firstServlet extends HttpServlet {
    public firstServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // super.doGet(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   String str=  req.getParameter("name");
    HttpSession session= req.getSession();
    session.setAttribute("sessionVal",str);
   req.setAttribute("val",str);
        RequestDispatcher rd = req.getRequestDispatcher("second");
        rd.forward(req,resp);

    }
}
