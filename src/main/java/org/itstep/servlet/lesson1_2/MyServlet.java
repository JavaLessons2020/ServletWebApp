package org.itstep.servlet.lesson1_2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends HttpServlet {

//    @Override
//    public void init(ServletConfig config) throws ServletException {
//        super.init(config);
//    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //resp.setContentType("text/html");


        HttpSession session = req.getSession();

        Integer count = (Integer) session.getAttribute("count");

        if (count == null) {
            session.setAttribute("count", count = 1);
        }else {
            session.setAttribute("count", count+=1);
        }
        //session.setAttribute("count", count++);

        PrintWriter writer = resp.getWriter();
        //writer.println("<h1>Hello client</h1>");
        writer.println("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Title</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h2>Specialty:</h2>\n" + req.getParameter("spec") +
                "<h2>Experience:</h2>\n" + req.getParameter("exp") +
                "<p>count =" + count +"</p>" +
                "</body>\n" +
                "</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.service(req, resp);
//    }
//
//    @Override
//    public void destroy() {
//        super.destroy();
//    }
}
