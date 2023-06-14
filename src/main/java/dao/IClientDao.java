package dao;

import java.util.List;
import metier.Client;

public interface IClientDao {
	public Client addClient(Client c);
	public Client updateClient(Client c);
	public List<Client> findClient(String motCle);
	public List<Client> findAllClients();
	public void deletClient(int id);
	public Client getClient(int id);
}
