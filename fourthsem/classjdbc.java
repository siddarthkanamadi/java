package fourthsem;
import java.sql.*;
public class classjdbc {

	public static void main(String[] args) {
		Connection conn=null;
		String url="jdbc:mysql://localhost:3306/";
		String dbname="siddarthjava";
		String driver="com.mysql.cj.jdbc.Driver";
		String username="danksidd";
		String password="danksidd";
		try{
			Class.forName(driver).newInstance();
			Connection con=DriverManager.getConnection(url+dbname,username,password);
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("Select * from college");
			System.out.println("Results");
			while (rs.next()) {
				String id =rs.getString(1);
				System.out.println(id);
				String name=rs.getString(2);
				System.out.println(name);
				
			}
			st.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
