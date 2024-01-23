import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int age = 30;
        Date now = new Date();
        String message = "Hello World    " + " !! ";
        System.out.println(message.trim());
        //explicit casting where developer changes the type of variable
        double x = 1.1;
        int y = (int) x + 2;
        System.out.println(y);


        String z = "5";
        int a = Integer.parseInt(z) + 2; //type changing of string into int
        System.out.println(a);

        //Math function
        int result = (int) Math.floor(42.52);
        int randomNumber = (int) (Math.random() * 101);
        System.out.println(randomNumber);

        //abstract class
        String abs = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(abs);
    }
}