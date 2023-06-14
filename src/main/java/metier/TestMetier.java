package metier;

import java.util.List;

import dao.VoitureDaoImp;

public class TestMetier {
	public static void main(String[] args) {
		VoitureDaoImp metier = new VoitureDaoImp();
		List<Voiture> voitures=metier.findVoiture("T");
		for(Voiture v :voitures)
		System.out.println(v.getCouleur());
		}
}
