import java.rmi.*;

public class Client {
    public static void main(String[] args) {
        try {
            PriceCalculator calculator = (PriceCalculator) Naming.lookup("rmi://localhost/PriceCalculator");
            double sellingPrice = calculator.calculateSellingPrice();
            System.out.println("Selling Price: Rs " + sellingPrice);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}