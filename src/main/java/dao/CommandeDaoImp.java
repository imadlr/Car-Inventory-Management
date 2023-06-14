package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import metier.Client;
import metier.Commande;

public class CommandeDaoImp implements ICommandeDao {

	@Override
	public Commande addCommande(Commande d) {
		Connection con = SingletonConnection.getConnection();
		try {
			PreparedStatement st = con.prepareStatement("insert into commande(numero, date_commande, quantite, id_client, id_voiture) values"
					+ "(?, ?, ?, ?, ?)");
			st.setInt(1, d.getNumero());
			st.setString(2, d.getDate());
			st.setInt(3, d.getQuantite());
			st.setInt(4, d.getIdClient());
			st.setInt(5, d.getIdVoiture());
			st.executeUpdate();
			PreparedStatement st2 = con.prepareStatement("select max(id) as id from commande");
			ResultSet rs = st2.executeQuery();
			if(rs.next()) d.setId(rs.getInt("id"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return d;
	}

	@Override
	public Commande getCommande(int id) {
		Connection con = SingletonConnection.getConnection();
		Commande d = new Commande();
		try {
			PreparedStatement st = con.prepareStatement("select * from commande where id = ?");
			st.setInt(1, id);
			ResultSet r = st.executeQuery();
			if(r.next()) {
				d.setId(r.getInt("id"));
				d.setNumero(r.getInt("numero"));
				d.setDate(""+r.getDate("date_commande"));
				d.setQuantite(r.getInt("quantite"));
				d.setIdClient(r.getInt("id_client"));
				d.setIdVoiture(r.getInt("id_voiture"));
			}
			st.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return d;
	}

	@Override
	public List<Commande> getAllCommandes() {
		Connection con = SingletonConnection.getConnection();
		List<Commande> commandes = new ArrayList<Commande>();
		try {
			PreparedStatement st = con.prepareStatement("select * from commande");
			ResultSet r = st.executeQuery();
			while(r.next()) {
				Commande d = new Commande();
				d.setId(r.getInt("id"));
				d.setNumero(r.getInt("numero"));
				d.setDate(r.getString("date_commande"));
				d.setQuantite(r.getInt("quantite"));
				d.setIdClient(r.getInt("id_client"));
				d.setIdVoiture(r.getInt("id_voiture"));
				commandes.add(d);
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return commandes;
	}

	@Override
	public List<Commande> findCommande(int num) {
		Connection con = SingletonConnection.getConnection();
		List<Commande> commandes = new ArrayList<Commande>();
		try {
			PreparedStatement st = con.prepareStatement("select * from commande where numero = ?");
			st.setInt(1, num);
			ResultSet r = st.executeQuery();
			if(r.next()) {
				Commande d = new Commande();
				d.setId(r.getInt("id"));
				d.setNumero(r.getInt("numero"));
				d.setDate(r.getString("date_commande"));
				d.setQuantite(r.getInt("quantite"));
				d.setIdClient(r.getInt("id_client"));
				d.setIdVoiture(r.getInt("id_voiture"));
				commandes.add(d);
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return commandes;
	}

	@Override
	public Commande updateCommande(Commande d) {
		Connection con = SingletonConnection.getConnection();
		try {
			PreparedStatement st = con.prepareStatement("update commande set numero =?, date_commande= ?, quantite= ?, id_client =?,"
					+ " id_voiture =? where id = ?");
			st.setInt(1, d.getNumero());
			st.setString(2, d.getDate());
			st.setInt(3, d.getQuantite());
			st.setInt(4, d.getIdClient());
			st.setInt(5, d.getIdVoiture());
			st.setInt(6, d.getId());
			st.executeUpdate();
			st.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return d;
	}

	@Override
	public void deleteCommande(int id) {
		Connection con = SingletonConnection.getConnection();
		try {
			PreparedStatement st = con.prepareStatement("delete from commande where id = ?");
			st.setInt(1, id);
			st.executeUpdate();
			st.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		
	}

}
