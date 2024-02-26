import java.rmi.*;

public class Server {


    public static void main(String[] args) {
        try {
            PriceCalculatorImpl calculator = new PriceCalculatorImpl();
            Naming.rebind("PriceCalculator", calculator);
            System.out.println("PriceCalculator server is ready.");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
