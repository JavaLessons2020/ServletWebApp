package org.itstep.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        //       PrintWriter writer = resp.getWriter();
        //        writer.println("<h1>login</h1>" + login + "<br>");
        //        writer.println("<h1>password</h1>" + password + "<br>");

        req.setAttribute("login", login);
        req.setAttribute("password", password);


        //отображает страницу
        req.getRequestDispatcher("login.jsp").forward(req, resp);
    }
}
