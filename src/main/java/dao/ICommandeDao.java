package dao;

import java.util.List;

import metier.Commande;

public interface ICommandeDao {
	public Commande addCommande(Commande d);
	public Commande getCommande(int id);
	public List<Commande> getAllCommandes();
	public List<Commande> findCommande(int num);
	public Commande updateCommande(Commande d);
	public void deleteCommande(int id);
}
