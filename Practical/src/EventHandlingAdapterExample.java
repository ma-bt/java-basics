/*1.	Write a program to handle action event, item event,
mouse event (both adapter and delegation method),
key event (both adapter and delegation method), focus event (both adapter and delegation),
window event (both adapter and delegation) list selection event.adapter*/


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class EventHandlingAdapterExample extends JFrame {
    private JLabel label;
    private JList<String> list;


    public EventHandlingAdapterExample() {
        super("Event Handling Adapter Example");

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

        // Add action listener using adapter
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button clicked");
            }
        });

        // Add item listener using adapter
        comboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                label.setText("Combo Box Item: " + comboBox.getSelectedItem());
            }
        });

        // Add mouse listener using adapter
        container.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
            }
        });

        // Add key listener using adapter
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                label.setText("Key Typed: " + e.getKeyChar());
            }
        });

        // Add focus listener using adapter
        checkBox.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                label.setText("Focus Gained on Checkbox");
            }
        });

        // Add window listener using adapter
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Create a list
        String[] data = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};
        list = new JList<>(data);
        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    label.setText("Selected: " + list.getSelectedValue());
                }
            }
        });

        container.add(new JScrollPane(list));

        // Set frame properties
        setSize(500, 500);
        setLocationRelativeTo(null);
        setTitle("Supriya  Thapa Bhujel ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventHandlingAdapterExample frame = new EventHandlingAdapterExample();
        frame.setVisible(true);
    }
}
