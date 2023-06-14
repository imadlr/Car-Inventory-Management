package web;

import java.util.ArrayList;

import java.util.List;
import metier.Commande;


public class CommandeModel {
	private String motCle;
	private List<Commande> commandes = new ArrayList<Commande>();
	private int nombreCommande;
	
	public int getNombreCommande() {
		return nombreCommande;
	}

	public void setNombreCommande(int nombreCommande) {
		this.nombreCommande = nombreCommande;
	}

	public String getMotCle() {
		return motCle;
	}

	/*
	 * @Override public String toString() { return "CommandeModel [motCle=" + motCle
	 * + "]"; }
	 */
	public void setMotCle(String motCle) {
		this.motCle = motCle;
	}
	public List<Commande> getCommandes() {
		return commandes;
	}
	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}
	
	
	
}
