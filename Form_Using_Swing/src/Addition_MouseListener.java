import javax.swing.*;
import java.awt.event.*;

public class Addition_MouseListener implements MouseListener {

    JFrame f;
    JLabel l1, l2, l3, l4;
    JButton b1;
    JTextField t1, t2, t3, t4;
    JPanel p1, p2, p3, sp1, sp2;

    Addition_MouseListener() {

        f = new JFrame("Addition");

        l1 = new JLabel("First Number:");
        l1.setBounds(70, 100, 100, 30);
        t1 = new JTextField(3);
        t1.setBounds(180, 100, 150, 30);

        l2 = new JLabel("Second Number:");
        l2.setBounds(70, 150, 100, 30);
        t2 = new JTextField(10);
        t2.setBounds(180, 150, 150, 30);

        b1 = new JButton("Result");
        b1.setBounds(70, 200, 260, 30);

        l3 = new JLabel("Mouse Released : ");
        l3.setBounds(70, 250, 100, 30);
        t3 = new JTextField(10);
        t3.setBounds(180, 250, 150, 30);

        l4 = new JLabel("Mouse Released: ");
        l4.setBounds(70, 300, 150, 30);
        t4 = new JTextField();
        t4.setBounds(180, 300, 150, 30);

        t4.addMouseListener(this);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int sum = num1 + num2;
                t3.setText(String.valueOf(sum));
            }
        });

        f.setSize(800, 800);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(l4);
        f.add(b1);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        Addition_MouseListener addition = new Addition_MouseListener();
    }

    public void mousePressed(MouseEvent e) {
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());
        int sum = num1 + num2;
        t3.setText(String.valueOf(sum));
//        t4.setText(null);
    }

    public void mouseReleased(MouseEvent e) {
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());
        int difference = num1 - num2;
//        t3.setText(String.valueOf(difference));
//       JOptionPane.showMessageDialog(f, "The difference is " + difference);
        t4.setText(String.valueOf(difference));
    }

    // Unused MouseListener methods
    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
}
