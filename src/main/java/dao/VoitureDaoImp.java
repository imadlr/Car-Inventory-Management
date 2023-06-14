package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import metier.Voiture;

public class VoitureDaoImp implements IVoitureDao {

	@Override
	public Voiture addVoiture(Voiture v) {
		Connection con = SingletonConnection.getConnection();
		try {
			PreparedStatement st = con.prepareStatement("insert into voitures_stock(marque, modele, coulour, matricule, quantite, prix_achat, date_achat) values"
					+ "(?, ?, ?, ?, ?, ?, ?)");
			st.setString(1, v.getMarque());
			st.setString(2, v.getModele());
			st.setString(3, v.getCouleur());
			st.setString(4, v.getMatricule());
			st.setInt(5, v.getQuantite());
			st.setFloat(6, v.getPrixAchat());
			st.setString(7,v.getDateAchat());
			st.executeUpdate();
			PreparedStatement st2 = con.prepareStatement("select max(id) as id from voitures_stock");
			ResultSet rs = st2.executeQuery();
			if(rs.next()) v.setId(rs.getInt("id"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return v;
	}

	@Override
	public Voiture updateVoiture(Voiture v) {
		Connection con = SingletonConnection.getConnection();
		try {
			PreparedStatement st = con.prepareStatement("update voitures_stock set marque = ?, modele =?, coulour= ?, matricule =?, quantite= ?,"
					+ "prix_achat= ?, date_achat= ? where id = ?");
			st.setString(1, v.getMarque());
			st.setString(2, v.getModele());
			st.setString(3, v.getCouleur());
			st.setString(4, v.getMatricule());
			st.setInt(5, v.getQuantite());
			st.setFloat(6, v.getPrixAchat());
			st.setString(7,v.getDateAchat());
			st.setInt(8, v.getId());
			st.executeUpdate();
			st.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return v;
	}

	@Override
	public List<Voiture> findVoiture(String motCl) {
		Connection con = SingletonConnection.getConnection();
		List<Voiture> voitures = new ArrayList<Voiture>();
		try {
			PreparedStatement st = con.prepareStatement("select * from voitures_stock where marque like ?");
			st.setString(1, "%"+motCl+"%");
			ResultSet r = st.executeQuery();
			while(r.next()) {
				Voiture v = new Voiture();
				v.setMarque(r.getString("marque"));
				v.setModele(r.getString("modele"));
				v.setCouleur(r.getString("coulour"));
				v.setId(r.getInt("id"));
				v.setMatricule(r.getString("matricule"));
				v.setQuantite(r.getInt("quantite"));
				voitures.add(v);
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return voitures;
	}

	@Override
	public void deletVoiture(int id) {
		Connection con = SingletonConnection.getConnection();
		try {
			PreparedStatement st = con.prepareStatement("delete from voitures_stock where id = ?");
			st.setInt(1, id);
			st.executeUpdate();
			st.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public Voiture getVoiture(int id) {
		Connection con = SingletonConnection.getConnection();
		Voiture v = new Voiture();
		try {
			PreparedStatement st = con.prepareStatement("select * from voitures_stock where id = ?");
			st.setInt(1, id);
			ResultSet r = st.executeQuery();
			while(r.next()) {
				v.setMarque(r.getString("marque"));
				v.setModele(r.getString("modele"));
				v.setCouleur(r.getString("coulour"));
				v.setId(r.getInt("id"));
				v.setMatricule(r.getString("matricule"));
				v.setQuantite(r.getInt("quantite"));
				v.setPrixAchat(r.getFloat("prix_achat"));
				v.setDateAchat(r.getString("date_achat"));
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return v;
	}

}
