import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/** Shared database settings used by assignments 19-24. */
public final class JdbcConfig {
    public static final String URL = "jdbc:mysql://localhost:3306/libraryjava";
    public static final String USER = "root";
    public static final String PASSWORD = "YOUR_MYSQL_PASSWORD";

    private JdbcConfig() { }

    public static Connection open() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void loadDriver() throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
    }
}
