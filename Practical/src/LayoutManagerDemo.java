import javax.swing.*;
import java.awt.*;

public class LayoutManagerDemo extends JFrame {
    public LayoutManagerDemo() {
        super("FlowLayout Example");

        // Create panel with FlowLayout
        JPanel panel = new JPanel(new FlowLayout());
        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));

        // Add panel to frame
        add(panel);

        // Set frame properties
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
           LayoutManagerDemo example = new LayoutManagerDemo();
            example.setVisible(true);
        });
    }
}
