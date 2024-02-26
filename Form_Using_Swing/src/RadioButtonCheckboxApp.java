import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class RadioButtonCheckboxApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame(" Supriya's Radio Button and Checkbox App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(new GridLayout(3, 1));

        JRadioButton radioButton = new JRadioButton("Select me");
        JCheckBox checkBox = new JCheckBox("Check me");

        JTextField textField = new JTextField();

        panel.add(radioButton);
        panel.add(checkBox);
        panel.add(textField);

        // ActionListener for the radio button
        radioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (radioButton.isSelected()) {
                    textField.setText("Radio button is selected");
                } else {
                    textField.setText("Radio button is deselected");
                }
            }
        });

        // ItemListener for the checkbox
        checkBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    textField.setText("Checkbox is checked");
                } else {
                    textField.setText("Checkbox is unchecked");
                }
            }
        });
    }
}