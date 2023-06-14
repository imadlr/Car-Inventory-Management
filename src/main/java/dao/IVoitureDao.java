package dao;

import java.util.List;

import metier.Voiture;

public interface IVoitureDao {
	
	public Voiture addVoiture(Voiture v);
	public Voiture updateVoiture(Voiture v);
	public List<Voiture> findVoiture(String motCl);
	public void deletVoiture(int id);
	public Voiture getVoiture(int id);
	
}
