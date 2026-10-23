import javax.swing.*;
import java.awt.*;
import java.sql.*;

/** Assignment 24 alternative exercise: book issue tracking form. */
public class Assignment24BookIssueGUI extends JFrame {
    private final JTextField bookId = new JTextField();
    private final JTextField student = new JTextField();
    private final JTextField issueDate = new JTextField();
    private final JTextField returnDate = new JTextField();

    public Assignment24BookIssueGUI() {
        setTitle("Book Issue Tracking");
        setSize(420, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel form = new JPanel(new GridLayout(5, 2, 6, 6));
        form.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));

        form.add(new JLabel("Book ID"));
        form.add(bookId);
        form.add(new JLabel("Student name"));
        form.add(student);
        form.add(new JLabel("Issue date (YYYY-MM-DD)"));
        form.add(issueDate);
        form.add(new JLabel("Return date (YYYY-MM-DD)"));
        form.add(returnDate);

        JButton saveButton = new JButton("Save issue");
        saveButton.addActionListener(event -> save());
        form.add(new JLabel());
        form.add(saveButton);

        add(form);
    }

    private void save() {
        String query = "INSERT INTO book_issues "
                + "(book_id, student_name, issue_date, return_date) VALUES (?, ?, ?, ?)";

        try {
            JdbcConfig.loadDriver();

            try (Connection connection = JdbcConfig.open();
                 PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, Integer.parseInt(bookId.getText()));
                statement.setString(2, student.getText());
                statement.setDate(3, Date.valueOf(issueDate.getText()));
                statement.setDate(4, Date.valueOf(returnDate.getText()));
                statement.executeUpdate();
            }

            JOptionPane.showMessageDialog(this, "Book issue saved.");
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(
                    this,
                    exception.getMessage(),
                    "Database error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Assignment24BookIssueGUI window = new Assignment24BookIssueGUI();
            window.setVisible(true);
        });
    }
}
