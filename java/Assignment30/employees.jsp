<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="../WEB-INF/jdbc.jspf" %>
<%
String action=request.getParameter("action");
try (Connection c=openConnection()) {
    if ("add".equals(action)) {
        String query = "INSERT INTO web_employees "
                + "(name, department, salary) VALUES (?, ?, ?)";

        try (PreparedStatement statement = c.prepareStatement(query)) {
            statement.setString(1, request.getParameter("name"));
            statement.setString(2, request.getParameter("department"));
            statement.setBigDecimal(
                    3,
                    new java.math.BigDecimal(request.getParameter("salary")));
            statement.executeUpdate();
        }
    }

    if ("delete".equals(action)) {
        String query = "DELETE FROM web_employees WHERE employee_id = ?";

        try (PreparedStatement statement = c.prepareStatement(query)) {
            statement.setInt(1, Integer.parseInt(request.getParameter("id")));
            statement.executeUpdate();
        }
    }

    if ("update".equals(action)) {
        String query = "UPDATE web_employees "
                + "SET name = ?, department = ?, salary = ? "
                + "WHERE employee_id = ?";

        try (PreparedStatement statement = c.prepareStatement(query)) {
            statement.setString(1, request.getParameter("name"));
            statement.setString(2, request.getParameter("department"));
            statement.setBigDecimal(
                    3,
                    new java.math.BigDecimal(request.getParameter("salary")));
            statement.setInt(4, Integer.parseInt(request.getParameter("id")));
            statement.executeUpdate();
        }
    }
} catch (Exception e) { request.setAttribute("error", e.getMessage()); }
%>
<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee CRUD</title>
</head>
<body>
    <h1>Employee Management (CRUD)</h1>

<% if (request.getAttribute("error") != null) { %>
    <p><%= request.getAttribute("error") %></p>
<% } %>

    <form method="post">
        <input type="hidden" name="action" value="add">
        <label>
            Name:
            <input name="name" required>
        </label>
        <label>
            Department:
            <input name="department" required>
        </label>
        <label>
            Salary:
            <input name="salary" type="number" step="0.01" required>
        </label>
        <button type="submit">Add</button>
    </form>

    <br>

    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Department</th>
            <th>Salary</th>
            <th>Actions</th>
        </tr>

<% try (Connection connection = openConnection();
       Statement statement = connection.createStatement();
       ResultSet result = statement.executeQuery(
               "SELECT employee_id, name, department, salary "
                       + "FROM web_employees ORDER BY employee_id")) {
    while (result.next()) {
%>
        <tr>
            <form method="post">
                <td>
                    <%= result.getInt("employee_id") %>
                    <input type="hidden" name="id"
                           value="<%= result.getInt("employee_id") %>">
                </td>
                <td>
                    <input name="name" value="<%= result.getString("name") %>">
                </td>
                <td>
                    <input name="department"
                           value="<%= result.getString("department") %>">
                </td>
                <td>
                    <input name="salary" value="<%= result.getBigDecimal("salary") %>">
                </td>
                <td>
                    <button name="action" value="update">Update</button>
                    <button name="action" value="delete">Delete</button>
                </td>
            </form>
        </tr>
<%  }
   } catch (Exception exception) { %>
        <tr>
            <td colspan="5"><%= exception.getMessage() %></td>
        </tr>
<% } %>
    </table>
</body>
</html>
