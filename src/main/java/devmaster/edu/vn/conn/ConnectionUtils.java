package devmaster.edu.vn.conn;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class ConnectionUtils {
	public static Connection getMSSQLConnection() throws SQLException, ClassNotFoundException {
		String hostName = "localhost";
		String sqlInstanceName = "SQL2019";
		String dbName = "Lab04JspServletJDBC";
		String userName = "sa";
		String password = "123456";	
		
		String connectionURL = "jdbc:sqlserver://" + hostName + ":1000;intance" + sqlInstanceName + ";databaseName= " + dbName;
		Connection conn = DriverManager.getConnection(connectionURL, userName, password);
		return conn;
		
	}
	public static void closebackQuietly(Connection conn) {
		try {
			conn.close();
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void rollQuietly(Connection conn) {
		try {
			conn.close();
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
