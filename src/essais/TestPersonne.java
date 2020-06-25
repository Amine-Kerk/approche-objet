package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {

		AdressePostale adresse1 = new AdressePostale(13, "pierre larousse", 75000, "paris");

		Personne pers1 = new Personne("Kerkoub", "Amine", adresse1);

		Personne pers2 = new Personne("Baubet", "jean-pierre");

	//utilisation de la methode d'affichage 
		pers1.nomMethode();
		
    //changement d'un paramétre 
		pers1.setNom("Marie");
    //affichage du paraméter changé
		pers1.nomMethode();

		
		pers2.nomMethode();
		pers2.setNom("Pernaut");
		pers2.nomMethode();
	}

}