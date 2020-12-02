package org.itstep.servlet.lesson3;

import org.itstep.DAO.StudentDAO;
import org.itstep.model.Student;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.SQLException;

public class SessionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        StudentDAO studentDAO = new StudentDAO();
        session.setAttribute("data", "simple data from session");

        Student student = (Student) session.getAttribute("student");

        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String phone = request.getParameter("phone");

        if (student == null) {
            student = new Student();
            student.setName(name);
            student.setAge(age);
            student.setPhone(phone);
        }

        try {
            studentDAO.add(student);
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        session.setAttribute("student", student);

        Cookie cookie = new Cookie("cookieName", "cookieValue");
        cookie.setMaxAge(10*60*60);
        response.addCookie(cookie);

        Cookie[] cookies = request.getCookies();

        for (Cookie cookie1 : cookies) {
            System.out.println(cookie1.getName());
        }

        request.getRequestDispatcher("session_ex.jsp").forward(request, response);
    }
}
