import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LayoutManagerExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Layout Manager Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Panel with null layout (absolute positioning)
        JPanel nullLayoutPanel = createNullLayoutPanel();
        frame.add(nullLayoutPanel, BorderLayout.NORTH);

        // Panel with FlowLayout
        JPanel flowLayoutPanel = createFlowLayoutPanel();
        frame.add(flowLayoutPanel, BorderLayout.CENTER);

        // Panel with GridLayout
        JPanel gridLayoutPanel = createGridLayoutPanel();
        frame.add(gridLayoutPanel, BorderLayout.SOUTH);

        // Panel with BorderLayout
        JPanel borderLayoutPanel = createBorderLayoutPanel();
        frame.add(borderLayoutPanel, BorderLayout.WEST);

        // Panel with CardLayout
        JPanel cardLayoutPanel = createCardLayoutPanel();
        frame.add(cardLayoutPanel, BorderLayout.EAST);

        frame.setVisible(true);
    }

    private static JPanel createNullLayoutPanel() {
        JPanel panel = new JPanel(null); // Use null layout
        JButton button1 = new JButton("Button 1");
        button1.setBounds(10, 10, 80, 30); // Set absolute position and size
        JButton button2 = new JButton("Button 2");
        button2.setBounds(100, 10, 80, 30);
        panel.add(button1);
        panel.add(button2);
        return panel;
    }

    private static JPanel createFlowLayoutPanel() {
        JPanel panel = new JPanel(new FlowLayout());
        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));
        return panel;
    }

    private static JPanel createGridLayoutPanel() {
        JPanel panel = new JPanel(new GridLayout(2, 2));
        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));
        panel.add(new JButton("Button 4"));
        return panel;
    }

    private static JPanel createBorderLayoutPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JButton("North"), BorderLayout.NORTH);
        panel.add(new JButton("South"), BorderLayout.SOUTH);
        panel.add(new JButton("East"), BorderLayout.EAST);
        panel.add(new JButton("West"), BorderLayout.WEST);
        panel.add(new JButton("Center"), BorderLayout.CENTER);
        return panel;
    }

    private static JPanel createCardLayoutPanel() {
        JPanel panel = new JPanel(new CardLayout());
        JButton card1Button = new JButton("Card 1");
        JButton card2Button = new JButton("Card 2");
        JButton card3Button = new JButton("Card 3");
        panel.add(card1Button, "Card 1");
        panel.add(card2Button, "Card 2");
        panel.add(card3Button, "Card 3");

        // Add ActionListener to switch between cards
        ActionListener cardSwitchListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) panel.getLayout();
                cardLayout.next(panel);
            }
        };

        card1Button.addActionListener(cardSwitchListener);
        card2Button.addActionListener(cardSwitchListener);
        card3Button.addActionListener(cardSwitchListener);

        return panel;
    }
}
