import java.sql.*;
public class First_Demo {

    public static void main (String[] args) throws Exception {
        String sql = "select name from food where price=13";
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String userName ="postgres";
        String password = "1234";

        Connection con = DriverManager.getConnection(url, userName,password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);

        rs.next();
        String data = rs.getString(1);
        System.out.println(data);
    }
}
