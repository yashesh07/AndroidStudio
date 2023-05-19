package Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SqlStatementManager {
	
	/**
	 * 
	 */

	public void setUpDatabase() {
		Connection Conn;
		try {
			Conn = DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password=rootPass");
			Statement s = Conn.createStatement();
			int result = s.executeUpdate("CREATE DATABASE hotelBoYoDB");
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	public void setUpDatabase(String username, String password) {
		Connection Conn;
		try {
			Conn = DriverManager.getConnection("jdbc:mysql://localhost/?user="+ username +"&password="+ password);
			Statement s = Conn.createStatement();
			int result = s.executeUpdate("CREATE DATABASE hotelBoYoDB");
			System.out.println(result);
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
	/**
	 * Sets up connection with our database
	 * in second method we pass url, username and password
	 * url - url to connect to the database
	 * username and password login info to authenticate user to access database
	 * @return Connection and prints Connected if successful
	 * @throws Exception
	 */
	public Connection getConnection() throws Exception{
		try {
			
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://sql6.freemysqlhosting.net/sql6453555";
			String username = "sql6453555";
			String password = "I4UFFpMYVa";
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connected");
	
			return conn;
			
		} catch(Exception e) {System.out.println(e);}
		return null;
	}
	public Connection getConnection(String url, String username, String password) throws Exception{
		try {
				
			String driver = "com.mysql.cj.jdbc.Driver";
			Class.forName(driver);
				
			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connected");
		
			return conn;
				
		} catch(Exception e) {System.out.println(e);}
		return null;
	}
	
	
	/**
	 * These methods are for creating table, second method takes create statement as @param
	 * @throws Exception
	 */
	public void createTable() throws Exception{
		try {
			
			Connection conn = getConnection();
			PreparedStatement create = conn.prepareStatement(
					"CREATE TABLE IF NOT EXISTS tablename(id int NOT NULL AUTO_INCREMENT, first varchar(255), last varchar(255), PRIMARY KEY(id))");
			create.executeUpdate();
		} catch(Exception e) {System.out.println(e);}
		finally {System.out.println("Done");}
	}
	public void createTable(String createTableSQL) throws Exception{
		try {
			
			Connection conn = getConnection();
			PreparedStatement create = conn.prepareStatement(createTableSQL);
			create.executeUpdate();
		} catch(Exception e) {System.out.println(e);}
		finally {System.out.println("Table created");}
	}
	
	/**
	 * These methods are for insert statement, second method takes insert statement as @param
	 * @throws Exception
	 */
	public void post() throws Exception{	
		final String var1 = "john";
		final String var2 = "miller";
		try {			
			Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement("INSERT INTO tablename (first, last) VALUES ('" + var1 + "', '" + var2 + "')");
			posted.executeUpdate();					
		} catch(Exception e) { System.out.println(e); }
		
		finally {System.out.println("Insert completed");}
	}
	
	public void post(String insertStatement) throws Exception{
		try {		
			Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement(insertStatement);
			posted.executeUpdate();				
		} catch(Exception e) { System.out.println(e); }
		
		finally {System.out.println("Insert completed");}
	}
	
	
	/**
	 * In second method we use predefined Select statements, also store the result with query @param var1, 
	 * you can use multiple queries though, better to use first method in this case.
	 * while in first we create the method for our own use- code time
	 * @return
	 * @throws Exception
	 */
	public ArrayList<String> get() {
		try {
			Connection con = getConnection();
			//PreparedStatement statement = con.prepareStatement("SELECT * FROM tablename");
			PreparedStatement statement = con.prepareStatement("SELECT first, last FROM tablename");
			
			ResultSet result = statement.executeQuery();
			//storing result according to ur need, here stored last in array list and printing first and last to console
			ArrayList<String> arr = new ArrayList<>();
			while(result.next()) {
				System.out.print(result.getString("first"));
				System.out.print(" ");
				System.out.println(result.getString("first"));
				
				arr.add(result.getString("last"));
			}
			System.out.println("All records have been selected");
			return arr;
		} catch(Exception e) {System.out.println(e);}
		
		return null;
	}	
	public ArrayList<String> get(String selesctStatement) {
		try {
			Connection con = getConnection();
			//PreparedStatement statement = con.prepareStatement("SELECT * FROM tablename");
			PreparedStatement statement = con.prepareStatement(selesctStatement);
			
			ResultSet result = statement.executeQuery();
			
			//to do incomplete
			ArrayList<String> arr = new ArrayList<>();
			while(result.next()) {
				System.out.println(result.getString("first"));
				
				arr.add(result.getString("last"));
			}
			System.out.println("All records have been selected");
			return arr;
		} catch(Exception e) {System.out.println(e);}
		
		return null;
	}
	public ArrayList<String> get(String selesctStatement, String var1) {
		try {
			Connection con = getConnection();
			//PreparedStatement statement = con.prepareStatement("SELECT * FROM tablename");
			PreparedStatement statement = con.prepareStatement(selesctStatement);
			
			ResultSet result = statement.executeQuery();
			
			ArrayList<String> arr = new ArrayList<>();
			while(result.next()) {
				System.out.print(result.getString(var1));
				
				arr.add(result.getString(var1));
			}
			System.out.println("All records have been selected");
			return arr;
		} catch(Exception e) {System.out.println(e);}
		return null;
	}
	
}
