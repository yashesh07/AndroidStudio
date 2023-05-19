package Practice;

import java.sql.*;

public class MYSQL {
    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://sql6.freemysqlhosting.net/sql6453555";
        String userName = "sql6453555";
        String pass = "I4UFFpMYVa";

        Connection con = DriverManager.getConnection(url, userName, pass);
        System.out.println("Connection established......");
        //Creating the Statement
        Statement stmt = con.createStatement();
        //Query to create a table
        String query = "CREATE TABLE CUSTOMERS("
                + "ID INT NOT NULL, "
                + "NAME VARCHAR (20) NOT NULL, "
                + "AGE INT NOT NULL, "
                + "SALARY DECIMAL (18, 2), "
                + "ADDRESS CHAR (25) , "
                + "PRIMARY KEY (ID))";
        stmt.execute(query);
        System.out.println("Table Created......");

    }
}
