import javax.swing.JFrame;

import javax.swing.JScrollPane;

import javax.swing.JTable;

public class TableDemo {

    JFrame f ;

    public TableDemo() {

        f =new JFrame("Table Example");

        f.setSize(450,250);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String data[][] = {{"Anusha ","kathmandu","anu@gmail.com"},{"Panda","Pokhara","panda@gmail.com"},{"Papi","butwal","lolipop@gmail.com"}};

        String heading [] = {"Name" , "Address","Email Address"};

        JTable table = new JTable(data, heading);

        JScrollPane js = new JScrollPane(table);

        f.setLayout(null);

        js.setBounds(20, 50, 400, 80);

        f.add(js);

        f.setVisible(true);

    }

    public static void main(String[] args) {

        new TableDemo();

    }

} 