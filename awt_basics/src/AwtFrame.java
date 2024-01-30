import java.awt.*;
import java.awt.event.*;

public class AwtFrame {
    public AwtFrame() {
        Frame frame = new Frame();

        Label label = new Label("This is an Label");
        label.setBounds(40, 90, 150,30);

        TextField textField = new TextField("John Disuja");
        textField.setBounds(40, 120, 150, 30);

        Button button  = new Button("Click Me");
        button.setBounds(40,50,80,40);

        frame.setTitle("This is Frame title");
        frame.add(button);
        frame.add(label);
        frame.add(textField);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });// for frame closing button

    }
    //    public AwtFrame()  {
    //        setSize(400,300);
    //        setVisible(true);
    //    }

    public static void main(String[] args) {
       AwtFrame frame =  new AwtFrame();
    }
}
