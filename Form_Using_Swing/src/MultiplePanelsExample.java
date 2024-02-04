import javax.swing.*;
import java.awt.*;

public class MultiplePanelsExample {

    MultiplePanelsExample() {

        JFrame f = new JFrame("Multiple Panels Example");
        f.setSize(400,400);
        f.setLayout(new BorderLayout());

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.RED);
        panel1.add(new JLabel("Panel 1"));

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.GREEN);
        panel2.add(new JLabel("Panel 2"));

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.BLUE);
        panel3.add(new JLabel("Panel 3"));


        f.add(panel1, BorderLayout.NORTH);
        f.add(panel2, BorderLayout.CENTER);
        f.add(panel3, BorderLayout.SOUTH);

        f.setVisible(true);


    }

    public static void main( String[] args) {
        MultiplePanelsExample multiPanle = new MultiplePanelsExample();
    }
}
