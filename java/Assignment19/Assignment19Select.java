import java.sql.*;

/** Assignment 19: retrieve student and product records with SELECT. */
public class Assignment19Select {
    public static void main(String[] args) {
        try {
            JdbcConfig.loadDriver();
            try (Connection con = JdbcConfig.open()) {
                printStudents(con);
                printProducts(con);
            }
        } catch (SQLException | ClassNotFoundException e) {
            System.err.println("Assignment 19: " + e.getMessage());
        }
    }

    private static void printStudents(Connection con) throws SQLException {
        System.out.println("\nSTUDENTS");
        String sql = "SELECT roll_no, name, course, marks FROM students";
        try (Statement st = con.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                System.out.printf("%d | %s | %s | %.2f%n",
                        rs.getInt("roll_no"),
                        rs.getString("name"),
                        rs.getString("course"),
                        rs.getDouble("marks"));
            }
        }
    }

    private static void printProducts(Connection con) throws SQLException {
        System.out.println("\nPRODUCTS");
        String sql = "SELECT product_id, product_name, quantity, price FROM products";
        try (Statement st = con.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                System.out.printf("%d | %s | quantity=%d | price=%.2f%n",
                        rs.getInt("product_id"),
                        rs.getString("product_name"),
                        rs.getInt("quantity"),
                        rs.getDouble("price"));
            }
        }
    }
}
