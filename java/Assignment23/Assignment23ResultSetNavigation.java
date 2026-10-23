import java.sql.*;

/** Assignment 23: scroll through employee records using a scrollable ResultSet. */
public class Assignment23ResultSetNavigation {
    public static void main(String[] args) {
        String sql = "SELECT employee_id, name, department, salary FROM employees ORDER BY employee_id";
        try {
            JdbcConfig.loadDriver();

            try (Connection connection = JdbcConfig.open();
                 Statement statement = connection.createStatement(
                         ResultSet.TYPE_SCROLL_INSENSITIVE,
                         ResultSet.CONCUR_READ_ONLY);
                 ResultSet result = statement.executeQuery(sql)) {

                while (result.next()) {
                    System.out.printf("%d | %s | %s | %.2f%n",
                            result.getInt("employee_id"),
                            result.getString("name"),
                            result.getString("department"),
                            result.getDouble("salary"));
                }

                if (result.last()) {
                    System.out.println("Last employee: " + result.getString("name"));
                }

                if (result.first()) {
                    System.out.println("First employee: " + result.getString("name"));
                }
            }
        } catch (SQLException | ClassNotFoundException exception) {
            System.err.println("Assignment 23: " + exception.getMessage());
        }
    }
}
