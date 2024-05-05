package fourthsem;
import java.sql.*;
public class jdbc{

	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/siddarthjava","root","danksidd");
			Statement st=con.createStatement();
			String qurey="create table employees(name varchar(25),phoneno int,address varchar(25));";
			st.executeUpdate(qurey);
			System.out.println("connection is made");
			st.close();
			con.close();
		} 
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
