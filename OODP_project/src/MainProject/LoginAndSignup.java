package MainProject;

import java.sql.*;
import java.util.Scanner;

public class LoginAndSignup {

    public boolean login(String role, String id, String pass) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String query = "select * from login_details";

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc", "root", "Yashesh#07");
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);

        boolean isDetailsCorrect = false;
        while(rs.next()){
            if(rs.getString(1).equals(role) && rs.getString(2).equals(id) && rs.getString(3).equals(pass)){
                isDetailsCorrect = true;
                break;
            }
        }
        st.close();
        connection.close();
        return isDetailsCorrect;
    }

    public boolean signin(String id, String pass, String confirmPass) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");

        String query = "select * from login_details";

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc", "root", "Yashesh#07");
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);

        boolean isDetailsCorrect = true;
        if(pass.equals(confirmPass)){
            while(rs.next()){
                if(rs.getString(2).equals(id)){
                    isDetailsCorrect = false;
                    break;
                }
            }
            if(isDetailsCorrect){
                String q = "insert into login_details values (?,?,?)";
                PreparedStatement ps = connection.prepareStatement(q);
                ps.setString(1, "user");
                ps.setString(2, id);
                ps.setString(3, pass);
                ps.executeUpdate();
                ps.close();
            }
            else System.out.println("This ID is already registered. Please try with different ID.");
        }
        else System.out.println("Password and confirm password are not matching. Please try again...");
        st.close();
        connection.close();
        return isDetailsCorrect;
    }
}
