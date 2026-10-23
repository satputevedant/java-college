<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="../WEB-INF/jdbc.jspf" %>
<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration</title>
</head>
<body>
    <h1>User Registration</h1>

    <form method="post" action="result.jsp">
        <label>
            Name:
            <input name="name" required>
        </label>
        <br>

        <label>
            Email:
            <input type="email" name="email" required>
        </label>
        <br>

        <label>
            Phone:
            <input name="phone">
        </label>
        <br>

        <label>
            Password:
            <input type="password" name="password" required>
        </label>
        <br>

        <button type="submit">Register</button>
    </form>
</body>
</html>
