/*
9.	Write a program to demonstrate the use of result set to retrieve data from database.
 */

import java.sql.SQLException;
import java.sql.*;
import javax.sql.rowset.*;



public class RowSetDemo {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            JdbcRowSet rs1 = RowSetProvider.newFactory().createJdbcRowSet();
            //
            String url = "jdbc:mysql://localhost:3306/prime";

            rs1.setUrl(url);
            rs1.setUsername("root");
            rs1.setPassword("");
            //sql command
            rs1.setCommand("select * from tbl_reg");
            rs1.execute();

            //extracting al row
            while (rs1.next()) {
                System.out.println("id is" + rs1.getInt("id"));
                System.out.println("username is" + rs1.getString("username"));
                System.out.println("password is" + rs1.getString("password"));
                System.out.println("gender is" + rs1.getString("gender"));
                System.out.println("course is" + rs1.getString("course"));

            }
            //extracting 2nd row
            rs1.absolute(2);

            System.out.println("id is" + rs1.getInt("id"));
            System.out.println("username is" + rs1.getString("username"));
            System.out.println("password is" + rs1.getString("password"));
            System.out.println("gender is" + rs1.getString("gender"));
            System.out.println("course is" + rs1.getString("course"));

            //updating username of 2nd row to jhon and acourse to csit
            rs1.updateString("username", "tibra");
            rs1.updateString("course", "csit");
            rs1.updateRow();

            System.out.println("--after updating second row--");
            System.out.println("id is" + rs1.getInt("id"));
            System.out.println("username is" + rs1.getString("username"));
            System.out.println("password is" + rs1.getString("password"));
            System.out.println("gender is" + rs1.getString("gender"));
            System.out.println("course is" + rs1.getString("course"));
            System.out.println("Nasla Maharjan 23486");

            //inserting new record on last row
            rs1.last();
//            for primary key defined 
//            rs1.updateNull("id");
            rs1.updateInt("id", 5);
            rs1.updateString("username", "sam");
            rs1.updateString("password", "sam");
            rs1.updateString("repassword", "sam");
            rs1.updateString("gender", "male");
            rs1.updateString("course", "CSIT");
rs1.insertRow();//to insert new row
rs1.moveToCurrentRow();
        } catch (ClassNotFoundException c) {
            System.out.println(c);
        } catch (SQLException s) {
            System.out.println(s);
        }

    }
}

