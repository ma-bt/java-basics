import java.awt.*;

public class FlowLayoutDemo {

    FlowLayoutDemo() {
        Frame f = new Frame("Flow Layout");
        f.setSize(1000, 1000);
        f.setVisible(true);

        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        Button button4 = new Button("Button 3");

        TextArea textArea1 = new TextArea("text here");
        TextArea textArea2 = new TextArea("text here");
        TextArea textArea3 = new TextArea("text here");
        TextArea textArea4 = new TextArea("text here");
        
//Flow_layout
        f.setLayout(new FlowLayout(FlowLayout.LEFT));

        //grid_layout
//        f.setLayout(new GridLayout(0, 3));

        //border_layout
//        f.setLayout(new BorderLayout());
//        f.add(button1, BorderLayout.CENTER);
//        f.add(button2, BorderLayout.PAGE_START);
//        f.add(button3, BorderLayout.SOUTH);
//        f.add(button4, BorderLayout.WEST);

        f.add(button1);
        f.add(button2);
        f.add(button3);
        f.add(button4);

        f.add(textArea1);
        f.add(textArea2);
        f.add(textArea3);
        f.add(textArea4);

    }

    public static void main(String[] args) {
        FlowLayoutDemo frame = new FlowLayoutDemo();
    }
}
