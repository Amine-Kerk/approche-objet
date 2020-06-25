package essais;

import entites.AdressePostale;

public class TestAdressePostale {

	public static void main(String[] args) {
	
//adresse 1 et 2 sont des adresses locales inutilisables en dehors le main
		AdressePostale adresse1 = new AdressePostale(); 
		
		adresse1.numeroRue= 10;
		adresse1.libelleRue="Pierre Larousse";
		adresse1.codePostal=75000;
		adresse1.ville="Paris";
		
		AdressePostale adresse2 = new AdressePostale();
		
		adresse2.numeroRue= 96;
		adresse2.libelleRue="Forestier";
		adresse2.codePostal=34000;
		adresse2.ville="Montpellier";

	}

}
