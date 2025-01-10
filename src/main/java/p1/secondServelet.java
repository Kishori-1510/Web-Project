package p1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebServlet("/second")
public class secondServelet extends HttpServlet {

    public secondServelet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // super.doGet(req, resp);
        HttpSession session = req.getSession();
        String sessionVal =(String) session.getAttribute("sessionVal");
        String arr =(String) req.getAttribute("val");
        System.out.println(sessionVal);
        System.out.println(arr);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // super.doPost(req, resp);
        HttpSession session = req.getSession();
       String sessionVal =(String) session.getAttribute("sessionVal");
        String arr =(String) req.getAttribute("val");
        System.out.println(sessionVal);
        System.out.println(arr);
    }
}
