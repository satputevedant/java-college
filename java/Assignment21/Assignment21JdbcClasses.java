import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/** Assignment 21: DriverManager, Connection and Statement demonstration. */
public class Assignment21JdbcClasses {

    public static void main(String[] args) {
        try {
            JdbcConfig.loadDriver();
            System.out.println("Driver loaded: com.mysql.cj.jdbc.Driver");

            try (Connection connection = JdbcConfig.open();
                 Statement statement = connection.createStatement()) {
                String status = connection.isValid(2) ? "CONNECTED" : "NOT CONNECTED";
                System.out.println("Connection status: " + status);
                System.out.println("Student database is connected successfully.");

                try (ResultSet result = statement.executeQuery("SELECT DATABASE()")) {
                    if (result.next()) {
                        System.out.println("Database: " + result.getString(1));
                    }
                }
            }
        } catch (SQLException | ClassNotFoundException exception) {
            System.err.println("Assignment 21: " + exception.getMessage());
        }
    }
}
