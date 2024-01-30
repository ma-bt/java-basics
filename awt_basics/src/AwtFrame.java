import java.awt.*;
import java.awt.event.*;

public class AwtFrame {


    public AwtFrame() {
        Frame frame = new Frame();

        Label label = new Label("This is an Label");
        label.setBounds(40, 90, 150, 30);

        TextField textField = new TextField("John Disuja");
        textField.setBounds(40, 120, 150, 30);

        TextArea textArea = new TextArea();
        textArea.setBounds(40, 200, 200, 200);

        Checkbox checkbox = new Checkbox("Checkbox");
        checkbox.setBounds(40, 150, 80, 40);

        Button button = new Button("Click Me");
        button.setBounds(40, 50, 80, 40);
        button.setBackground(Color.gray);
        button.setForeground(Color.white);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button click successfully");
            }
        });

        frame.setTitle("This is Frame title");
        frame.add(button);
        frame.add(label);
        frame.add(textField);
        frame.add(checkbox);
        frame.add(textArea);
        frame.setSize(700, 700);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });// for frame closing button

    }


    public static void main(String[] args) {
        AwtFrame frame = new AwtFrame();
    }
}
