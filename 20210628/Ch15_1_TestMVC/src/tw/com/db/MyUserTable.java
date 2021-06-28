package tw.com.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Result;

public class MyUserTable {
	public static boolean createUser(User user) {
		return createUser(user.getAccount(),user.getPassword());
	}
	public static boolean createUser(String account,String password) {
				
		 try(Connection conn =  DBTools.getConnection();
		    PreparedStatement stm = conn.prepareStatement("INSERT INTO myuser(account,password)VALUES(?,?)");){			
			 stm.setString(1, account);
			 stm.setString(2, password);
			 stm.executeUpdate();
		 }catch(SQLException ex) {			 
			 System.out.println(ex);
			 return false;
		 }		
		return true;
	}
	
	public static User loging(String account,String password) {
		User user =null;
		try(Connection conn  = DBTools.getConnection();
			PreparedStatement stm = conn.prepareStatement("SELECT * FROM myuser WHERE "
					+ "account = ? AND password = ?");	){
			stm.setString(1,account);
			stm.setString(2,password);
			ResultSet result = stm.executeQuery();
			
			if (result.next()) {
				int id = result.getInt(1);
				String accountStr = result.getString(2);
				String passwordStr = result.getString(3);
				user = new User(id,accountStr,passwordStr);
			}
				
		}catch(SQLException ex) {
			 System.out.println(ex);
			 return null;
		}
		return user;
	}
	
	
}
