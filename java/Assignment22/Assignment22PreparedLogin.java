import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/** Assignment 22: secure authentication using PreparedStatement and ResultSet. */
public class Assignment22PreparedLogin {

    public static void main(String[] args) {
        String username = args.length > 0 ? args[0] : "admin";
        String password = args.length > 1 ? args[1] : "admin123";
        authenticate(username, password);
    }

    static void authenticate(String username, String password) {
        String query = "SELECT role FROM users WHERE username = ? AND password = ?";

        try {
            JdbcConfig.loadDriver();
            try (Connection connection = JdbcConfig.open();
                 PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, username);
                statement.setString(2, password);

                try (ResultSet result = statement.executeQuery()) {
                    if (result.next()) {
                        System.out.println("Login successful. Access granted to "
                                + result.getString("role") + ".");
                    } else {
                        System.out.println("Invalid username or password. Access denied.");
                    }
                }
            }
        } catch (SQLException | ClassNotFoundException exception) {
            System.err.println("Assignment 22: " + exception.getMessage());
        }
    }
}
