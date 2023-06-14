package web;

import java.util.ArrayList;
import java.util.List;

import metier.Voiture;

public class VoitureModel {
	private String motCle;
	private List<Voiture> voitures = new ArrayList<Voiture>();
	private int nombreVoiture;
	
	public int getNombreVoiture() {
		return nombreVoiture;
	}
	public void setNombreVoiture(int nombreVoiture) {
		this.nombreVoiture = nombreVoiture;
	}
	public String getMotCle() {
		return motCle;
	}
	public void setMotCle(String motCle) {
		this.motCle = motCle;
	}
	public List<Voiture> getVoitures() {
		return voitures;
	}
	public void setVoitures(List<Voiture> voitures) {
		this.voitures = voitures;
	}
	
}
