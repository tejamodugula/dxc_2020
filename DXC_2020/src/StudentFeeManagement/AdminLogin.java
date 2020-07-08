package StudentFeeManagement;

import java.util.Scanner;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AdminLogin {
	
	Scanner sc=new Scanner(System.in);
	String name,password,email,contact;
	public void addAccount() throws SQLException, IOException
	{
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "Nanna3630*");
		
		PreparedStatement stmtInsert = con.prepareStatement("insert into AddAccountant values(?,?,?,?)");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your Name:");
		String name=br.readLine();
		System.out.println("Enter your Password:");
		String password=br.readLine();
		System.out.println("Enter your Email:");
		String email=br.readLine();
		System.out.println("Enter your Contact:");
		String contact=br.readLine();
		
		stmtInsert.setString(1,name);
		stmtInsert.setString(2,password);
		stmtInsert.setString(3,email);
		stmtInsert.setString(4,contact);
		
		System.out.println(stmtInsert.executeUpdate() + " No of Records Inserted");
	}
	public void viewAccount()throws SQLException, IOException
	{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "Nanna3630*");
		Statement stmt = con.createStatement(); // Statement interface used for Creating SQL Query to be executed
		ResultSet rs = stmt.executeQuery("select * from AddAccountant");
		while (rs.next())
			System.out.println(rs.getString(1) + ", " + rs.getString(2) + ", " + rs.getString(3) + ", " + rs.getInt(4));
		
	}
	public void logOut()
	{
		System.out.println("You are Loged Out");
	}
}