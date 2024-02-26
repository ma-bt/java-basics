import java.io.*;
import java.net.*;
import java.util.*;

public class Server {
    static int fact(int a) {
        if (a == 0) return 1;
        return a * fact(a - 1);
    }

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(1254);
        Socket cs = ss.accept();

        Scanner ins = new Scanner(cs.getInputStream());
        PrintWriter outs = new PrintWriter(cs.getOutputStream(), true);

//        int facto = ins.nextInt();
//        int result = fact(facto);

        outs.println("Hello");

        outs.close();
        ins.close();
        cs.close();
        ss.close();
    }
}
