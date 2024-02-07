import java.io.*;
import java.net.*;
import java.util.*;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket cs = new Socket("localhost", 1254);

        //get an input file handle from the socket and read the input
        Scanner ins = new Scanner(cs.getInputStream());
        PrintWriter outs = new PrintWriter(cs.getOutputStream(), true);
        //sent to server
        outs.println(5);
        //received  from the server
        int fact = ins.nextInt();
        System.out.println("Send Number:" + 5);
        System.out.println("Factorial from Server:" + fact);

        ins.close();
        outs.close();
        cs.close();

    }

}
