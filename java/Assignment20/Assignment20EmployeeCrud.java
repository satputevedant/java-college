import java.sql.*;

/** Assignment 20 alternative exercise: employee INSERT, UPDATE and DELETE. */
public class Assignment20EmployeeCrud {
    public static void main(String[] args) {
        try {
            JdbcConfig.loadDriver();

            try (Connection connection = JdbcConfig.open()) {
                String insert = "INSERT INTO employees "
                        + "(employee_id, name, department, salary) VALUES (?, ?, ?, ?)";

                try (PreparedStatement statement = connection.prepareStatement(insert)) {
                    statement.setInt(1, 9001);
                    statement.setString(2, "Demo Employee");
                    statement.setString(3, "IT");
                    statement.setDouble(4, 50000);
                    statement.executeUpdate();
                }

                String update = "UPDATE employees SET salary = ? WHERE employee_id = ?";
                try (PreparedStatement statement = connection.prepareStatement(update)) {
                    statement.setDouble(1, 55000);
                    statement.setInt(2, 9001);
                    statement.executeUpdate();
                }

                String delete = "DELETE FROM employees WHERE employee_id = ?";
                try (PreparedStatement statement = connection.prepareStatement(delete)) {
                    statement.setInt(1, 9001);
                    statement.executeUpdate();
                }

                System.out.println("Employee INSERT, UPDATE and DELETE completed.");
            }
        } catch (SQLException | ClassNotFoundException exception) {
            System.err.println("Assignment 20 employee exercise: " + exception.getMessage());
        }
    }
}
