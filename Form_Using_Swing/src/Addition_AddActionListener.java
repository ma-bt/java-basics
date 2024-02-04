import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Addition_AddActionListener implements ActionListener {

    JFrame f;
    JLabel l1, l2, l3,l4;
    JButton b1;
    JTextField t1, t2, t3,t4;
    JPanel p1,p2,p3,sp1,sp2;

    Addition_AddActionListener() {


        JFrame f =  new JFrame("Addition");

        l1 = new JLabel("First Number:");
        l1.setBounds(70,100, 100,30);
        t1 =  new JTextField(3);
        t1.setBounds(180,100, 150,30);


        l2 = new JLabel("Second Number:");
        l2.setBounds(70,150, 100,30);

        t2 = new JTextField(10);
        t2.setBounds(180,150, 150,30);

        b1 = new JButton("Sum");
        b1.setBounds(70,200, 260,30);

        l3 = new JLabel("Sum of two number: ");
        l3.setBounds(70,250, 100,30);

        t3 = new JTextField(10);
        t3.setBounds(180,250, 150,30);



        l4 = new JLabel("Press any key");
        l4.setBounds(70,300, 150,30);


        t4 = new JTextField();
        t4.setBounds(180,300, 150,30);

        t4.addKeyListener(new keychecker());




        b1.addActionListener(this);


        f.setSize(800,800);



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

    @Override

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == b1){
            int num1 =  Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());

            int sum = num1+num2;
            t4.setText(String.valueOf(sum));

        }
    }

    class keychecker extends KeyAdapter {
        public void keyPressed(KeyEvent e)
        {
            int num1 =  Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());

            int sum = num1+num2;

            JOptionPane.showMessageDialog(f,"the sum is " + sum);
            t3.setText(null);

        }
    }

    public static void main( String[] args) {
        Addition_AddActionListener addition = new Addition_AddActionListener();
    }
}
