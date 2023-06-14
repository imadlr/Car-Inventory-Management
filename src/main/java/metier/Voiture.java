package metier;

import java.sql.Date;

public class Voiture {
	private int id;
	private String marque;
	private String modele;
	private String couleur;
	private String matricule;
	private int quantite;
	private float prixAchat;
	private String dateAchat;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public float getPrixAchat() {
		return prixAchat;
	}
	public void setPrixAchat(float prixAchat) {
		this.prixAchat = prixAchat;
	}
	public String getDateAchat() {
		return dateAchat;
	}
	public void setDateAchat(String dateAchat) {
		this.dateAchat = dateAchat;
	}
	public Voiture(String marque, String modele, String couleur, String matricule, int quantite, float prixAchat,
			String dateAchat) {
		super();
		this.marque = marque;
		this.modele = modele;
		this.couleur = couleur;
		this.matricule = matricule;
		this.quantite = quantite;
		this.prixAchat = prixAchat;
		this.dateAchat = dateAchat;
	}
	public Voiture() {
	}
	
	
}
