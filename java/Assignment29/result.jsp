<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="../WEB-INF/jdbc.jspf" %>
<%
String name = request.getParameter("name");
String email = request.getParameter("email");
String phone = request.getParameter("phone");
String password = request.getParameter("password");

if (name != null && email != null && password != null) {
    String query = "INSERT INTO registrations "
            + "(name, email, phone, password_hash) VALUES (?, ?, ?, ?)";

    try (Connection connection = openConnection();
         PreparedStatement statement = connection.prepareStatement(query)) {
        statement.setString(1, name);
        statement.setString(2, email);
        statement.setString(3, phone);
        statement.setString(4, password);
        statement.executeUpdate();
    } catch (Exception exception) {
        request.setAttribute("error", exception.getMessage());
    }
}
%>
<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration Result</title>
</head>
<body>
<% if (request.getAttribute("error") == null) { %>
    <h1>Registration successful</h1>
    <p>Welcome, <%= name %>.</p>
<% } else { %>
    <h1>Registration failed</h1>
    <p><%= request.getAttribute("error") %></p>
<% } %>

    <a href="register.jsp">Back</a>
</body>
</html>
