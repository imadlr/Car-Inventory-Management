package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CalculeStatistique {
	
    public static int getNombreVoiture() {
    int nombreVoiture= 0;
		java.sql.Connection con = SingletonConnection.getConnection();
		try {
			PreparedStatement st = con.prepareStatement("select count(id) as nbre from voitures_stock");
			ResultSet r = st.executeQuery();
			if(r.next()) nombreVoiture = r.getInt("nbre");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return nombreVoiture;
    }
    
    public static int getNombreCommande() {
    	int nombreCommande= 0;
		java.sql.Connection con = SingletonConnection.getConnection();
		try {
			PreparedStatement st = con.prepareStatement("select count(id) as nbre from commande");
			ResultSet r = st.executeQuery();
			if(r.next()) nombreCommande = r.getInt("nbre");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return nombreCommande;
    }
    
    public static int getNombreClient() {
    	int nombreClient= 0;
		java.sql.Connection con = SingletonConnection.getConnection();
		try {
			PreparedStatement st = con.prepareStatement("select count(id) as nbre from clients");
			ResultSet r = st.executeQuery();
			if(r.next()) nombreClient = r.getInt("nbre");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return nombreClient;
    }
	
}
