package tw.com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBTools {
	public static Connection getConnection() throws SQLException {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/20210628db?serverTimezone=CST&useSSL=false&allowPublicKeyRetrieval=true";
		String user = "root";
		String password = "123456";
		Connection con = DriverManager.getConnection(url,user,password);
		return 	con;
	}

}
