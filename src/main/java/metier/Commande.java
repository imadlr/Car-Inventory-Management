package metier;

public class Commande {
	private int id;
	private int numero;
	private String date;
	private int quantite;
	private int idClient;
	private int idVoiture;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public int getIdVoiture() {
		return idVoiture;
	}

	public void setIdVoiture(int idVoiture) {
		this.idVoiture = idVoiture;
	}

	public Commande(int numero, String date, int quantite, int idClient, int idVoiture) {
		super();
		this.numero = numero;
		this.date = date;
		this.quantite = quantite;
		this.idClient = idClient;
		this.idVoiture = idVoiture;
	}

	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	}
	
