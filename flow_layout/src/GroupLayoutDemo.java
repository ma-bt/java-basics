import javax.swing.*;
import java.awt.*;
public class GroupLayoutDemo {
    JButton b1, b2, b3, b4;
    JPanel p;

    GroupLayoutDemo() {
        JFrame f = new JFrame();
        p = new JPanel();
        f.setSize(400, 400);
        GroupLayout gl = new GroupLayout(p);
        p.setLayout(gl);
        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        b3 = new JButton("Button 3");
        b4 = new JButton("Button 4");

        f.add(p);
        gl.setAutoCreateGaps(true);

        gl.setHorizontalGroup(
                gl.createSequentialGroup()
                        .addComponent(b1).addComponent(b2)
                        .addGroup(
                                gl.createParallelGroup()

                                        .addComponent(b3).addComponent(b4)));
        gl.setVerticalGroup(gl.createParallelGroup().addComponent(b1).addComponent(b2).addGroup(gl.createSequentialGroup().addComponent(b3).addComponent(b4)));
        f.setVisible(true);
    }

    public static void main(String[] args) {
        GroupLayoutDemo frame = new GroupLayoutDemo();
    }
}
