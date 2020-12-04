package org.itstep.servlet.lesson3_4;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TableServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int num = Integer.parseInt(request.getParameter("num"));

        request.setAttribute("num", num);

        request.getRequestDispatcher("table_show.jsp").forward(request, response);

    }
}
