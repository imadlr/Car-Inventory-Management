package web;

import java.io.IOException;
import java.util.List;

import dao.Authentification;
import dao.CalculeStatistique;
import dao.ClientDaoImpl;
import dao.CommandeDaoImp;
import dao.IClientDao;
import dao.ICommandeDao;
import dao.IVoitureDao;
import dao.VoitureDaoImp;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import metier.Client;
import metier.Commande;
import metier.Voiture;

@WebServlet("*.php")
public class ServletControleur extends HttpServlet{
	private IVoitureDao metierV;
	private IClientDao metierC;
	private ICommandeDao metierD;
	
	@Override
	public void init() throws ServletException {
		metierV = new VoitureDaoImp();
		metierC = new ClientDaoImpl();
		metierD = new CommandeDaoImp();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = req.getServletPath();
		if(path.equals("/home.php")) {
			VoitureModel modelV = new VoitureModel();
			modelV.setNombreVoiture(CalculeStatistique.getNombreVoiture());
			req.setAttribute("voiture", modelV);
			ClientModel modelC = new ClientModel();
			modelC.setNombreClient(CalculeStatistique.getNombreClient());
			req.setAttribute("client", modelC);
			CommandeModel modelD = new CommandeModel();
			modelD.setNombreCommande(CalculeStatistique.getNombreCommande());
			req.setAttribute("commande", modelD);
			req.getRequestDispatcher("home.jsp").forward(req, resp);
		}
		if(path.equals("/authentification.php") && req.getMethod().equalsIgnoreCase("post")) {
			String userName = req.getParameter("user");
			String passWord = req.getParameter("pass");
			if(Authentification.verifier(userName, passWord)) {
				VoitureModel modelV = new VoitureModel();
				modelV.setNombreVoiture(CalculeStatistique.getNombreVoiture());
				req.setAttribute("voiture", modelV);
				ClientModel modelC = new ClientModel();
				modelC.setNombreClient(CalculeStatistique.getNombreClient());
				req.setAttribute("client", modelC);
				CommandeModel modelD = new CommandeModel();
				modelD.setNombreCommande(CalculeStatistique.getNombreCommande());
				req.setAttribute("commande", modelD);
			    req.getRequestDispatcher("home.jsp").forward(req, resp); }
			else {
			req.getRequestDispatcher("userNotFound.jsp").forward(req, resp); }
		} else if(path.equals("/afficheVoitures.php")) {
			String mc = req.getParameter("motCle");
			List<Voiture> voitures = metierV.findVoiture(mc);
			VoitureModel modelV = new VoitureModel();
			modelV.setMotCle(mc);
			modelV.setVoitures(voitures);
			req.setAttribute("voiture", modelV);
			req.getRequestDispatcher("afficheVoitures.jsp").forward(req, resp);
		} else if (path.equals("/ajouterVoiture.php") && req.getMethod().equalsIgnoreCase("post")) {
			String marque = req.getParameter("marque");
			String modele = req.getParameter("modele");
			String couleur = req.getParameter("couleur");
			String matricule = req.getParameter("matricule");
			int quantite = Integer.parseInt(req.getParameter("quantite"));
			float prix = Float.parseFloat(req.getParameter("prixAchat"));
			String date = req.getParameter("dateAchat");
			Voiture voiture = metierV.addVoiture(new Voiture(marque, modele, couleur, matricule, quantite, prix, date));
			req.setAttribute("voiture", voiture);
			req.getRequestDispatcher("confirmationV.jsp").forward(req, resp);
		} else if (path.equals("/supprimerVoiture.php")) {
			int id = Integer.parseInt(req.getParameter("id"));
			metierV.deletVoiture(id);
			resp.sendRedirect("afficheVoitures.php?motCle=");
		} else if(path.equals("/modifierVoiture.php")) {
			int id = Integer.parseInt(req.getParameter("id"));
			Voiture v = metierV.getVoiture(id);
			req.setAttribute("voiture", v);
			req.getRequestDispatcher("modifierVoiture.jsp").forward(req, resp);
		} else if (path.equals("/modifierVoitureSave.php") && req.getMethod().equalsIgnoreCase("post")) {
			Voiture v = new Voiture();
			v.setId(Integer.parseInt(req.getParameter("id")));
			v.setMarque(req.getParameter("marque"));
			v.setModele(req.getParameter("modele"));
			v.setCouleur(req.getParameter("couleur"));
			v.setMatricule(req.getParameter("matricule"));
			v.setQuantite(Integer.parseInt(req.getParameter("quantite")));
			v.setPrixAchat(Float.parseFloat(req.getParameter("prixAchat")));
			v.setDateAchat(req.getParameter("dateAchat"));
			Voiture voiture = metierV.updateVoiture(v);
			req.setAttribute("voiture", voiture);
			req.getRequestDispatcher("confirmationV.jsp").forward(req, resp);
		} else if(path.equals("/afficheClients.php")) {
			String mc = req.getParameter("motCle");
			List<Client> clients = metierC.findClient(mc);
			ClientModel modelC = new ClientModel();
			modelC.setMotCle(mc);
			modelC.setClients(clients);
			req.setAttribute("client", modelC);
			req.getRequestDispatcher("afficheClients.jsp").forward(req, resp);
		}
		else if(path.equals("/afficheClientsAll.php")) {
			List<Client> clients = metierC.findAllClients();
			ClientModel modelC = new ClientModel();
			modelC.setClients(clients);
			req.setAttribute("client", modelC);
			req.getRequestDispatcher("afficheClients.jsp").forward(req, resp);
		}
		else if (path.equals("/ajouterClient.php") && req.getMethod().equalsIgnoreCase("post")) {
			String cin = req.getParameter("cin");
			String nom = req.getParameter("nom");
			String prenom = req.getParameter("prenom");
			String adresse = req.getParameter("adresse");
			String telephone = req.getParameter("telephone");
		    Client client = metierC.addClient(new Client(cin, nom, prenom, adresse, telephone));
			req.setAttribute("client", client);
			req.getRequestDispatcher("confirmationC.jsp").forward(req, resp);
		}else if (path.equals("/supprimerClient.php")) {
			int id = Integer.parseInt(req.getParameter("id"));
			metierC.deletClient(id);
			resp.sendRedirect("afficheClientsAll.php");
		} else if(path.equals("/modifierClient.php")) {
			int id = Integer.parseInt(req.getParameter("id"));
			Client c = metierC.getClient(id);
			req.setAttribute("client", c);
			req.getRequestDispatcher("modifierClient.jsp").forward(req, resp);
		} else if (path.equals("/modifierClientSave.php") && req.getMethod().equalsIgnoreCase("post")) {
			Client c = new Client();
			c.setId(Integer.parseInt(req.getParameter("id")));
			c.setCin(req.getParameter("cin"));
			c.setNom(req.getParameter("nom"));
			c.setPrenom(req.getParameter("prenom"));
			c.setAdresse(req.getParameter("adresse"));
			c.setTelephone(req.getParameter("telephone"));
			Client client = metierC.updateClient(c);
			req.setAttribute("client", client);
			req.getRequestDispatcher("confirmationC.jsp").forward(req, resp);
		} else if(path.equals("/afficheCommande.php")) {
			int mc = Integer.parseInt(req.getParameter("motCle"));
			List<Commande> commandes = metierD.findCommande(mc);
			CommandeModel modelD = new CommandeModel();
			modelD.setMotCle(""+mc+"");
			modelD.setCommandes(commandes);
			req.setAttribute("commande", modelD);
			req.getRequestDispatcher("afficheCommandes.jsp").forward(req, resp);
		}
		else if(path.equals("/afficheAllCommandes.php")) {
			List<Commande> commandes = metierD.getAllCommandes();
			CommandeModel modelD = new CommandeModel();
			modelD.setCommandes(commandes);
			req.setAttribute("commande", modelD);
			req.getRequestDispatcher("afficheCommandes.jsp").forward(req, resp);
		} else if (path.equals("/ajouterCommande.php") && req.getMethod().equalsIgnoreCase("post")) {
			int numero = Integer.parseInt(req.getParameter("numero"));
		    String date = req.getParameter("date");
			int quantite = Integer.parseInt(req.getParameter("quantite"));
			int idClient = Integer.parseInt(req.getParameter("idClient"));
			int idVoiture = Integer.parseInt(req.getParameter("idVoiture"));
			Commande commande = metierD.addCommande( new Commande(numero, date, quantite, idClient, idVoiture));
			req.setAttribute("commande", commande);
			req.getRequestDispatcher("confirmationD.jsp").forward(req, resp);
		} else if(path.equals("/modifierCommande.php")) {
			int id = Integer.parseInt(req.getParameter("id"));
			Commande d = metierD.getCommande(id);
			req.setAttribute("commande", d);
			req.getRequestDispatcher("modifierCommande.jsp").forward(req, resp);
		} else if (path.equals("/modifierCommandeSave.php") && req.getMethod().equalsIgnoreCase("post")) {
			Commande d = new Commande();
			d.setId(Integer.parseInt(req.getParameter("id")));
			d.setNumero(Integer.parseInt(req.getParameter("numero")));
			d.setDate(req.getParameter("date"));
			d.setQuantite(Integer.parseInt(req.getParameter("quantite")));
			d.setIdClient(Integer.parseInt(req.getParameter("idClient")));
			d.setIdVoiture(Integer.parseInt(req.getParameter("idVoiture")));
			Commande commande = metierD.updateCommande(d);
			req.setAttribute("commande", commande);
			req.getRequestDispatcher("confirmationD.jsp").forward(req, resp);
		} else if (path.equals("/supprimerCommande.php")) {
			int id = Integer.parseInt(req.getParameter("id"));
			metierD.deleteCommande(id);
			resp.sendRedirect("afficheAllCommandes.php");
		}
		else {
			resp.sendError(HttpServletResponse.SC_NOT_FOUND);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
}
