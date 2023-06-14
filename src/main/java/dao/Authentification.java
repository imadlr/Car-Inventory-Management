package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Authentification {
	
	public static boolean verifier(String user, String pass) {
		Connection con = SingletonConnection.getConnection();
		boolean res = false;
		try {
			PreparedStatement st = con.prepareStatement("select * from compte where username = ? and motPass = ?");
			st.setString(1, user);
			st.setString(2, pass);
			ResultSet r = st.executeQuery();
			if(r.next()) res = true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
		return res;
	}
	
}
