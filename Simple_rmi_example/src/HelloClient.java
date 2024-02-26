//Client Program

import java.rmi.*;
import java.net.*;
import java.io.*;

public class HelloClient {
    public static void main(String[] args) {
        try {
            String host = "localhost";
            HelloWorld remoObj = (HelloWorld) Naming.lookup("rmi://" + host + "/HelloWorld");
            System.out.println(remoObj.display());

        } catch (RemoteException re) {
            re.printStackTrace();
        } catch (NotBoundException nbe) {
            nbe.printStackTrace();
        }
    }
}
