package com.emp;

import java.io.IOException;
import java.sql.*;
import java.util.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

public class EmployeeServlet extends HttpServlet {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/employees_db";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "root"; 

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String empId = request.getParameter("id");
        List<Employee> employeeList = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);

            PreparedStatement stmt;
            if (empId != null && !empId.trim().isEmpty()) {
                stmt = conn.prepareStatement("SELECT * FROM employees WHERE id = ?");
                stmt.setInt(1, Integer.parseInt(empId));
            } else {
                stmt = conn.prepareStatement("SELECT * FROM employees");
            }

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                employeeList.add(new Employee(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("email"),
                    rs.getString("department")
                ));
            }

            conn.close();

        } catch (Exception e) {
            throw new ServletException("Database error: " + e.getMessage());
        }

        request.setAttribute("employees", employeeList);
        RequestDispatcher rd = request.getRequestDispatcher("employee.jsp");
        rd.forward(request, response);
    }
}
