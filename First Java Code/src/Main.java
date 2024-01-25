import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final int MONTHS = 12;
        final int PERCENT = 100;
        int PAYMENTS;
        int INTEREST_RATE;
        float MONTHLY_RATE;
        double MORTGAGE;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int PRINCIPLE = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annual_interest_rate = scanner.nextFloat();


        MONTHLY_RATE = (annual_interest_rate / PERCENT) / MONTHS;
        System.out.println("Monthly rate: " + MONTHLY_RATE);
        System.out.print("Period in Years: ");
        int time_period = scanner.nextInt();

        int TOTAL_NUMBER_OF_PAYMENTS = time_period * MONTHS;

        MORTGAGE = PRINCIPLE * (MONTHLY_RATE * Math.pow(1 + MONTHLY_RATE, TOTAL_NUMBER_OF_PAYMENTS)) / (Math.pow(1 + MONTHLY_RATE, TOTAL_NUMBER_OF_PAYMENTS) - 1);
//        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(MORTGAGE);
        System.out.println("Mortgage: " + MORTGAGE);


//        Date now = new Date();
//        String message = "Hello World    " + " !! ";
//        System.out.println(message.trim());
//        //explicit casting where developer changes the type of variable
//        double x = 1.1;
//        int y = (int) x + 2;
//        System.out.println(y);
//
//
//        String z = "5";
//        int a = Integer.parseInt(z) + 2; //type changing of string into int
//        System.out.println(a);
//
//        //Math function
//        int result = (int) Math.floor(42.52);
//        int randomNumber = (int) (Math.random() * 101);
//        System.out.println(randomNumber);
//
//        //abstract class
//        String abs = NumberFormat.getPercentInstance().format(0.1);
//        System.out.println(abs);
    }
}