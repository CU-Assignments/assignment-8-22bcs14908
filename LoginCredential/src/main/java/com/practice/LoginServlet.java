package com.practice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.*;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;


public class LoginServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            String username = request.getParameter("username");
            String password = request.getParameter("password");

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Login Received</title>");
            out.println("<style>");
            out.println("body { font-family: Arial; background-color: #eef2f3; }");
            out.println(".container { max-width: 400px; margin: auto; margin-top: 100px; background: #fff; padding: 30px; border-radius: 10px; box-shadow: 0 0 15px rgba(0,0,0,0.1); }");
            out.println("h2 { text-align: center; color: #333; }");
            out.println("p { font-size: 16px; color: #555; }");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class='container'>");
            out.print("<h1>Welcome, "+username+ "...</h1>" );
            out.println("<h2>Login Details Received</h2>");
            out.println("<p><strong>Username:</strong> " + username + "</p>");
            out.println("<p><strong>Password:</strong> " + password + "</p>");

            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
