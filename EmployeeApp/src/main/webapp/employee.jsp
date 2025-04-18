<%@ page import="java.util.List" %>
<%@ page import="com.emp.Employee" %>
<!DOCTYPE html>
<html>
<head>
    <title>Employee List</title>
    <style>
        table {
            width: 60%;
            border-collapse: collapse;
            margin: 40px auto;
        }
        th, td {
            border: 1px solid #ccc;
            padding: 10px;
            text-align: center;
        }
        th {
            background: #f2f2f2;
        }
        h2 {
            text-align: center;
        }
    </style>
</head>
<body>

<h2>Employee Details</h2>

<table>
    <tr>
        <th>ID</th><th>Name</th><th>Email</th><th>Department</th>
    </tr>
    <%
        List<Employee> employees = (List<Employee>) request.getAttribute("employees");
        if (employees != null && !employees.isEmpty()) {
            for (Employee emp : employees) {
    %>
                <tr>
                    <td><%= emp.getId() %></td>
                    <td><%= emp.getName() %></td>
                    <td><%= emp.getEmail() %></td>
                    <td><%= emp.getDepartment() %></td>
                </tr>
    <%
            }
        } else {
    %>
        <tr><td colspan="4">No employee(s) found</td></tr>
    <%
        }
    %>
</table>

<div style="text-align:center;">
    <a href="search.html">Back to Search</a>
</div>

</body>
</html>
