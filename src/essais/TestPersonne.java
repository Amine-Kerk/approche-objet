package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {

		AdressePostale adresse1 = new AdressePostale(13, "pierre larousse", 75000, "paris");

		Personne pers1 = new Personne("Kerkoub", "Amine", adresse1);

		Personne pers2 = new Personne("Baubet", "jean-pierre");

	
		pers1.nomMethode();
		

		pers1.setNom("Marie");

		pers1.nomMethode();
		
		
		String toto=pers1.getNom() ;
		
		AdressePostale lolo=pers1.getAdresse();
		
		System.out.println(pers1.getNom());
		
	}

}