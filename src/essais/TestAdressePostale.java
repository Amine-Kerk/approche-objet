package essais;
import entites.AdressePostale;

//cr�er une classe TestAdressePostale avec une m�thode static void main. 
public class TestAdressePostale {

	public static void main(String[] args) {

		// Cr�er 2 instances d�AdressePostale on respectant l'ordre du constructeur.

		AdressePostale adresse1 = new AdressePostale(13, "pierre larousse", 75000, "paris");

		AdressePostale adresse2 = new AdressePostale(96, "rue Forestier", 34000, "montpellier");
//affichage des adresses par la methode
		adresse1.adresseMethode();
		adresse2.adresseMethode();
		
		//adresse1.setAdresse("")
	}

}