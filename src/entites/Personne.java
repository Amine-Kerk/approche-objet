package entites;

//classe a 3 attributs

public class Personne {

	public String nom;
	public String prenom;
	public AdressePostale adresse;

	public Personne(String nvNom, String nvPrenom) {

		this.nom = nvNom;
		this.prenom = nvPrenom;
	}

	public Personne(String nvNom, String nvPrenom, AdressePostale nvAdresse) {

		this.nom = nvNom;
		this.prenom = nvPrenom;
		this.adresse = nvAdresse;

	}

	// créer une methode qui va afficher le nom en majiscule

	public void nomMethode() {

		System.out.println(nom.toUpperCase() + " " + prenom);

	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public AdressePostale getAdresse() {
		return adresse;
	}

	public void setAdresse(AdressePostale adresse) {
		this.adresse = adresse;
	}
	
	
	
	
    
}