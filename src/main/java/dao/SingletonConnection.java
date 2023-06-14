package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonConnection {
	static private Connection con;
	static {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionstock_voitures","root","");
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	public static Connection getConnection() {
		return con;
	}
	
}
