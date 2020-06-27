package essais;
import entites.AdressePostale;

//créer une classe TestAdressePostale avec une méthode static void main. 
public class TestAdressePostale {

	public static void main(String[] args) {

		// Créer 2 instances d’AdressePostale on respectant l'ordre du constructeur.

		AdressePostale adresse1 = new AdressePostale(13, "pierre larousse", 75000, "paris");

		AdressePostale adresse2 = new AdressePostale(96, "rue Forestier", 34000, "montpellier");
//affichage des adresses par la methode
		adresse1.adresseMethode();
		adresse2.adresseMethode();
		
		//adresse1.setAdresse("")
	}

}