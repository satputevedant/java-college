import java.sql.*;

/** Assignment 20: Create, Read, Update and Delete student records. */
public class Assignment20StudentCrud {
    public static void main(String[] args) {
        try {
            JdbcConfig.loadDriver();
            try (Connection con = JdbcConfig.open()) {
                create(con, 101, "Asha", "Java", 86.5);
                read(con);
                update(con, 101, 91.0);
                delete(con, 101);
            }
        } catch (SQLException | ClassNotFoundException e) {
            System.err.println("Assignment 20: " + e.getMessage());
        }
    }

    static void create(Connection c, int roll, String name, String course, double marks) throws SQLException {
        String q = "INSERT INTO students(roll_no,name,course,marks) VALUES(?,?,?,?)";

        try (PreparedStatement p = c.prepareStatement(q)) {
            p.setInt(1, roll);
            p.setString(2, name);
            p.setString(3, course);
            p.setDouble(4, marks);
            p.executeUpdate();
        }
    }

    static void read(Connection c) throws SQLException {
        try (Statement s = c.createStatement(); ResultSet r = s.executeQuery("SELECT * FROM students")) {
            while (r.next()) {
                System.out.printf("%d %s %s %.2f%n",
                        r.getInt("roll_no"),
                        r.getString("name"),
                        r.getString("course"),
                        r.getDouble("marks"));
            }
        }
    }

    static void update(Connection c, int roll, double marks) throws SQLException {
        String q = "UPDATE students SET marks = ? WHERE roll_no = ?";

        try (PreparedStatement p = c.prepareStatement(q)) {
            p.setDouble(1, marks);
            p.setInt(2, roll);
            p.executeUpdate();
        }
    }

    static void delete(Connection c, int roll) throws SQLException {
        String q = "DELETE FROM students WHERE roll_no = ?";

        try (PreparedStatement p = c.prepareStatement(q)) {
            p.setInt(1, roll);
            p.executeUpdate();
        }
    }
}
