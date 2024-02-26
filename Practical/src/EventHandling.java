/*
qs 1 with delegation
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class EventHandling extends JFrame {
    private final JLabel label;
    private final JList<String> list;

    public EventHandling() {
        super("Event Handling Example");

        // Create components
        JButton button = new JButton("Click Me");
        JTextField textField = new JTextField(20);
        JComboBox<String> comboBox = new JComboBox<>(new String[]{"Option 1", "Option 2", "Option 3"});
        JCheckBox checkBox = new JCheckBox("Check Me");
        label = new JLabel(" ");

        // Add components to content pane
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        container.add(button);
        container.add(textField);
        container.add(comboBox);
        container.add(checkBox);
        container.add(label);

        // Add action listener using delegation
        button.addActionListener(new MyActionListener());

        // Add item listener using delegation
        comboBox.addItemListener(new MyItemListener());

        // Add mouse listener using delegation
        container.addMouseListener(new MyMouseListener());

        // Add key listener using delegation
        textField.addKeyListener(new MyKeyListener());

        // Add focus listener using delegation
        checkBox.addFocusListener(new MyFocusListener());

        // Add window listener using delegation
        addWindowListener(new MyWindowListener());

        // Create a list
        String[] data = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};
        list = new JList<>(data);
        list.addListSelectionListener(new MyListSelectionListener());

        container.add(new JScrollPane(list));

        // Set frame properties
        setSize(500, 500);
        setLocationRelativeTo(null);
        setTitle("Nasla Maharjan 23486");
//        setTitle("Tibra Shrestha 23512");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Action Listener
    class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("Button clicked");
        }
    }

    // Item Listener
    class MyItemListener implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            JComboBox<String> comboBox = (JComboBox<String>) e.getSource();
            label.setText("Combo Box Item: " + comboBox.getSelectedItem());
        }
    }

    // Mouse Listener
    class MyMouseListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            label.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
        }
    }

    // Key Listener
    class MyKeyListener extends KeyAdapter {
        @Override
        public void keyTyped(KeyEvent e) {
            label.setText("Key Typed: " + e.getKeyChar());
        }
    }

    // Focus Listener
    class MyFocusListener extends FocusAdapter {
        @Override
        public void focusGained(FocusEvent e) {
            label.setText("Focus Gained on Checkbox");
        }
    }

    // Window Listener
    class MyWindowListener extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }

    // List Selection Listener
    class MyListSelectionListener implements ListSelectionListener {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            if (!e.getValueIsAdjusting()) {
                label.setText("Selected: " + list.getSelectedValue());
            }
        }
    }

    public static void main(String[] args) {
        EventHandling frame = new EventHandling();
        frame.setVisible(true);
    }
}
