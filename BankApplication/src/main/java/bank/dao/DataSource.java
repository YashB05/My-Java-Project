package bank.dao;
import java.sql.*;


public class DataSource {
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver"); //oracle.jdbc.OracleDriver
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		Connection con=null;
		try {
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","12345678");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;

	}

}

