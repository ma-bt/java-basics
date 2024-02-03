import javax.swing.*;
import javax.swing.JCheckBox;
import java.awt.FlowLayout;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame("User Form");
        f.setVisible(true);
        f.setSize(600,400);
        f.setLayout(new FlowLayout( FlowLayout.CENTER));

        JLabel label =  new JLabel("User Name: ");
        f.add(label);

        JTextField textField = new JTextField(10);
        f.add(textField);

        JLabel label2 =  new JLabel("Password: ");
        f.add(label2);

        JTextField textField2 = new JTextField(10);
        f.add(textField2);

        JCheckBox checkbox1 =  new JCheckBox("Male");
        JCheckBox checkbox2 =  new JCheckBox("Female");
        JCheckBox checkbox3 =  new JCheckBox("Unisex");

        f.add(checkbox1);
        f.add(checkbox2);
        f.add(checkbox3);


//        f.setLayout( new FlowLayout(FlowLayout.LEFT));
    }
}