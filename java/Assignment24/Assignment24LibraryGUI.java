import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

/** Assignment 24: Swing library management GUI backed by JDBC. */
public class Assignment24LibraryGUI extends JFrame {
    private final DefaultTableModel model = new DefaultTableModel(
            new String[]{"ID", "Title", "Author", "Available"}, 0);
    private final JTable table = new JTable(model);

    public Assignment24LibraryGUI() {
        setTitle("Library Management System");
        setSize(650, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton refreshButton = new JButton("Load Books");
        refreshButton.addActionListener(event -> loadBooks());

        add(new JScrollPane(table), BorderLayout.CENTER);
        add(refreshButton, BorderLayout.SOUTH);
    }

    private void loadBooks() {
        model.setRowCount(0);
        String query = "SELECT book_id, title, author, available FROM books";

        try {
            JdbcConfig.loadDriver();

            try (Connection connection = JdbcConfig.open();
                 Statement statement = connection.createStatement();
                 ResultSet result = statement.executeQuery(query)) {

                while (result.next()) {
                    model.addRow(new Object[]{
                            result.getInt("book_id"),
                            result.getString("title"),
                            result.getString("author"),
                            result.getBoolean("available")
                    });
                }
            }
        } catch (SQLException | ClassNotFoundException exception) {
            JOptionPane.showMessageDialog(
                    this,
                    exception.getMessage(),
                    "Database error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Assignment24LibraryGUI window = new Assignment24LibraryGUI();
            window.setVisible(true);
        });
    }
}
