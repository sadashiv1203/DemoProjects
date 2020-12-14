import java.io.FileReader;
import java.sql.*;
import java.util.Properties;
public class Ora_Conn {

	public static void main(String[] args) {
		try
		{
			String driver=null;
			String url=null;
			String username=null;
			String password=null;
			try {
				
				FileReader  reader=new FileReader("E://Sadashiv Suryaji-java//my java programs//Ora_Cobbections//src//db.properties");
				Properties pro=new Properties();
				
				pro.load(reader);
				
				driver=pro.getProperty("db.driver");
				url=pro.getProperty("db.url");
				username=pro.getProperty("db.username");
				password=pro.getProperty("db.password");
				
				
				
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.toString());
			}
			
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,username,password);
			Statement st=con.createStatement();
			String sql="insert into emp values(3)";
			st.executeUpdate(sql);
			con.close();
			
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
