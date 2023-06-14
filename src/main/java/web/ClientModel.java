package web;

import java.util.ArrayList;
import java.util.List;

import metier.Client;
import metier.Voiture;

public class ClientModel {
	private String motCle;
	private List<Client> clients = new ArrayList<Client>();
	private int nombreClient;
	
	public int getNombreClient() {
		return nombreClient;
	}
	public void setNombreClient(int nombreClient) {
		this.nombreClient = nombreClient;
	}
	public String getMotCle() {
		return motCle;
	}
	public void setMotCle(String motCle) {
		this.motCle = motCle;
	}
	public List<Client> getClients() {
		return clients;
	}
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}
	
}
