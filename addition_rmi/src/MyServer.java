import java.rmi.Naming;
import java.rmi.RemoteException;

public class MyServer {

    public static void main (String[] args){
        try{
            AdderRemote stub = new AdderRemote();
            Naming.rebind('rmi://localhost:5000/sono', stub);

        }catch (RemoteException re){
            re.printStackTrace();
        }

    }
}