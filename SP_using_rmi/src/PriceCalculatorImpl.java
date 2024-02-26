import java.rmi.*;
import java.rmi.server.*;

public class PriceCalculatorImpl extends UnicastRemoteObject implements PriceCalculator {
    private static final double COST_PRICE = 5000;
    private static final double DISCOUNT = 50;

    public PriceCalculatorImpl() throws RemoteException {
        super();
    }

    @Override
    public double calculateSellingPrice() throws RemoteException {
        return COST_PRICE - DISCOUNT;
    }

    public static void main(String[] args) {
        try {
            PriceCalculator stub = new PriceCalculatorImpl();
            Naming.rebind("PriceCalculator", stub);
            System.out.println("PriceCalculator server is ready.");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
