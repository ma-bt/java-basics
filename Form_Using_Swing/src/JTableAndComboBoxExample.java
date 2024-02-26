import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTableAndComboBoxExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("JTable and JComboBox Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel, BorderLayout.NORTH);

        // Create sample data for the JTable
        String[][] data = {
                {"supriya", "bhujel", "30"},
                {"mandira", "basnet", "25"},
                {"bhoot", "thapa", "40"}
        };

        // Create column names for the JTable
        String[] columnNames = {"First Name", "Last Name", "Age"};

        // Create a DefaultTableModel to hold the data and column names
        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);

        // Create the JTable using the DefaultTableModel
        JTable table = new JTable(tableModel);

        // Create a JComboBox with filter options
        String[] filterOptions = {"All", "30 and below", "Above 30"};
        JComboBox<String> filterComboBox = new JComboBox<>(filterOptions);

        // Add an ActionListener to the JComboBox for filtering the table data
        filterComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                filterTableData(table, filterComboBox.getSelectedIndex());
            }
        });

        // Add components to the panel
        panel.add(new JLabel("Filter:"));
        panel.add(filterComboBox);

        // Create a JScrollPane to hold the JTable
        JScrollPane scrollPane = new JScrollPane(table);
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    private static void filterTableData(JTable table, int filterIndex) {
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        tableModel.setRowCount(0); // Clear existing rows

        // Sample data for demonstration
        String[][] data = {
                {"supriya", "bhujel", "30"},
                {"mandira", "basnet", "25"},
                {"bhoot", "thapa", "40"}
        };

        for (String[] row : data) {
            int age = Integer.parseInt(row[2]);
            if (filterIndex == 0 || (filterIndex == 1 && age <= 30) || (filterIndex == 2 && age > 30)) {
                tableModel.addRow(row);
            }
        }
    }
}