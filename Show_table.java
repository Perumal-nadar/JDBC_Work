package Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Show_table {

	public Show_table() {
		try {
			
			String qur=("select * from furniture");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Furniture", "root", "root");
			PreparedStatement st=con.prepareStatement(qur);
			ResultSet rs= st.executeQuery();
			
			while(rs.next()) {
			
				System.out.println(rs.getString(1));
		
			}
	
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	
	}
}
