//server program

import java.rmi.*;
import java.io.*;
import java.net.*;

public class HelloServer {
    public static void main(String[] args) {
        try {
            HelloImpl localObj = new HelloImpl();
            Naming.rebind("rmi:///HelloWorld", localObj);

        } catch (RemoteException re) {
            re.printStackTrace();
        } catch (MalformedURLException mfe) {
            mfe.printStackTrace();
        }

    }

}
