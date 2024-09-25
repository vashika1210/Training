package com.example.helloworld;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/submit")
public class FormServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve form data
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String gender = request.getParameter("gender");

        // Set form data as request attributes
        request.setAttribute("name", name);
        request.setAttribute("age", age);
        request.setAttribute("gender", gender);

        // Forward request to the JSP page for display
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
