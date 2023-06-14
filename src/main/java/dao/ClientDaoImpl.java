package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import metier.Client;
import metier.Voiture;

public class ClientDaoImpl implements IClientDao {

	@Override
	public Client addClient(Client c) {
		Connection con = SingletonConnection.getConnection();
		try {
			PreparedStatement st = con.prepareStatement("insert into clients(cin, nom, prenom, adresse, telephone) values"
					+ "(?, ?, ?, ?, ?)");
			st.setString(1, c.getCin());
			st.setString(2, c.getNom());
			st.setString(3, c.getPrenom());
			st.setString(4, c.getAdresse());
			st.setString(5, c.getTelephone());
			st.executeUpdate();
			st.close();
			PreparedStatement st2 = con.prepareStatement("select max(id) as id from clients");
			ResultSet rs = st2.executeQuery();
			if(rs.next()) c.setId(rs.getInt("id"));
			st2.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return c;
	}

	@Override
	public Client updateClient(Client c) {
		Connection con = SingletonConnection.getConnection();
		try {
			PreparedStatement st = con.prepareStatement("update clients set cin =?, nom= ?, prenom= ?, adresse =?, telephone =?"
					+ "where id = ?");
			st.setString(1, c.getCin());
			st.setString(2, c.getNom());
			st.setString(3, c.getPrenom());
			st.setString(4, c.getAdresse());
			st.setString(5, c.getTelephone());
			st.setInt(6, c.getId());
			st.executeUpdate();
			st.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return c;
	}

	@Override
	public List<Client> findClient(String motCle) {
		Connection con = SingletonConnection.getConnection();
		List<Client> clients = new ArrayList<Client>();
		try {
			PreparedStatement st = con.prepareStatement("select * from clients where cin = ?");
			st.setString(1, motCle);
			ResultSet r = st.executeQuery();
			while(r.next()) {
				Client c = new Client();
				c.setCin(r.getString("cin"));
				c.setNom(r.getString("nom"));
				c.setPrenom(r.getString("prenom"));
				c.setId(r.getInt("id"));
				c.setAdresse(r.getString("adresse"));
				c.setTelephone(r.getString("telephone"));
				clients.add(c);
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return clients;
	}
	
	@Override
	public List<Client> findAllClients() {
		Connection con = SingletonConnection.getConnection();
		List<Client> clients = new ArrayList<Client>();
		try {
			PreparedStatement st = con.prepareStatement("select * from clients");
			ResultSet r = st.executeQuery();
			while(r.next()) {
				Client c = new Client();
				c.setCin(r.getString("cin"));
				c.setNom(r.getString("nom"));
				c.setPrenom(r.getString("prenom"));
				c.setId(r.getInt("id"));
				c.setAdresse(r.getString("adresse"));
				c.setTelephone(r.getString("telephone"));
				clients.add(c);
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return clients;
	}

	@Override
	public void deletClient(int id) {
		Connection con = SingletonConnection.getConnection();
		try {
			PreparedStatement st = con.prepareStatement("delete from clients where id = ?");
			st.setInt(1, id);
			st.executeUpdate();
			st.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public Client getClient(int id) {
		Connection con = SingletonConnection.getConnection();
		Client c = new Client();
		try {
			PreparedStatement st = con.prepareStatement("select * from clients where id = ?");
			st.setInt(1, id);
			ResultSet r = st.executeQuery();
			while(r.next()) {
				c.setCin(r.getString("cin"));
				c.setNom(r.getString("nom"));
				c.setPrenom(r.getString("prenom"));
				c.setId(r.getInt("id"));
				c.setAdresse(r.getString("adresse"));
				c.setTelephone(r.getString("telephone"));
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return c;
	}

}
