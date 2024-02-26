import java.rmi.*;

public interface PriceCalculator extends Remote {
    double calculateSellingPrice() throws RemoteException;
}