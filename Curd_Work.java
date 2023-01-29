package Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Curd_Work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void connection() {
		
		try {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/furniture","root","8010103117"); 
		
		} catch (Exception e) {

			e.printStackTrace();
		
		}
		
	}
	public void Create_Database() {
		
		try {
			
			String que ="create database furniture";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/furniture","root","8010103117");
			Statement st = con.createStatement();
			st.execute(que);
			st.close();
			
		}
		catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
	}
	public void Check_Database() {
		
		try {
			
			String que ="";
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/furniture","root","8010103117");
			Statement st = con.createStatement();
			
			st.execute(que);
			st.close();
			
		}
		catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
	}

}
