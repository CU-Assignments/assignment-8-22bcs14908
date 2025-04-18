<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Success</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f4f7f8;
        }

        .message-box {
            width: 400px;
            margin: 100px auto;
            background: #fff;
            padding: 30px;
            text-align: center;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }

        h2 {
            color: #28a745;
        }

        a {
            display: inline-block;
            margin-top: 20px;
            text-decoration: none;
            color: white;
            background: #007bff;
            padding: 10px 20px;
            border-radius: 5px;
        }

        a:hover {
            background: #0056b3;
        }
    </style>
</head>
<body>

<div class="message-box">
    <h2>Attendance recorded successfully!</h2>
    <p>Thank you, <strong><%= request.getAttribute("name") %></strong>.</p>
    <a href="attendance.jsp">Mark Another</a>
</div>

</body>
</html>
