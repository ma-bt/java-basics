import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame("User Form");
        f.setVisible(true);
        f.setSize(600,400);

        JLabel label =  new JLabel("User Name: ");
        f.add(label);

        JTextField textField = new JTextField(20);
        f.add(textField);
    }
}