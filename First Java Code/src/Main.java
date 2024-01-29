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
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(MORTGAGE);
        System.out.println("Mortgage: " + MORTGAGE);



    }
}