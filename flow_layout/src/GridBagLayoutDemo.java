import java.awt.*;

public class GridBagLayoutDemo {

    GridBagLayoutDemo() {
        Frame f = new Frame();
        f.setLayout(new GridBagLayout());

        GridBagConstraints gcb = new GridBagConstraints();

        Button button1 = new Button("Button 1");
        gcb.gridx = 0;
        gcb.gridy = 0;
        gcb.gridwidth = 1;
        gcb.fill = GridBagConstraints.HORIZONTAL;
        gcb.insets = new Insets(5,5,5,5);
        f.add(button1,gcb);

        Button button2 = new Button("Button 2");
        gcb.gridx = 1;
        gcb.gridy = 0;
        gcb.gridwidth = 1;
        f.add(button2,gcb);

        Button button3 = new Button("Button 3");
        gcb.gridx = 2;
        gcb.gridy = 0;
        gcb.gridwidth = 1;
        f.add(button3,gcb);

        Button button4 = new Button("Button 4");
        gcb.ipady = 40;
        gcb.gridx = 0;
        gcb.gridy = 1;
        gcb.gridwidth = 3;
        f.add(button4,gcb);


        f.setSize(400,400);
        f.setVisible(true);

    }

    public static void main (String[] args) {
        GridBagLayoutDemo layout =  new GridBagLayoutDemo();
    }
}
