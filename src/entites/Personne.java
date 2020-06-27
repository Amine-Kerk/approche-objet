package entites;

//classe a 3 attributs nom prenom et adresse

public class Personne {

	public String nom;
	public String prenom;
	public AdressePostale adresse;
// constructeur 
	public Personne(String nvNom, String nvPrenom) {
//valorisation des variables du constructeur
		this.nom = nvNom;
		this.prenom = nvPrenom;
	}
//constructeur des variables on rajoutant l'adresse
	public Personne(String nvNom, String nvPrenom, AdressePostale nvAdresse) {

		this.nom = nvNom;
		this.prenom = nvPrenom;
		this.adresse = nvAdresse;

	}

	// créer une methode qui va afficher l'adresse

	public void nomMethode() {

		System.out.println(nom.toUpperCase() + " " + prenom);

	}
//utilsation des getters et setters
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