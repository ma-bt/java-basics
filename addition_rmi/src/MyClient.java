import java.rmi.Naming;
import java.rmi.RemoteException;

public class MyClient {

    public static void main(String[] args)
    {
        try {
            String host = "localhost";
            Adder stub = (Adder) Naming.lookup("rmi://localhost:5000/sono");
            System.out.println(stub.add(23, 12));
        }catch (RemoteException re){
            re.printStackTrace();
        }
    }
}
