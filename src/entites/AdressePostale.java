package entites;

public class AdressePostale {

//les 4 attributs suivants : num�ro de rue, libell� de la rue, code postal et ville.

	public int numeroRue;
	public String libelleRue;
	public int codePostal;
	public String ville;

	// ajoutez lui un constructeur avec les 4
	// param�tres permettant de valoriser tous les attributs de la classe

	public AdressePostale(int nvNumeroRue, String nvLibelleRue, int nvCodePostal, String nvVille) {

		// hydratation ou valorisation des variables

		this.numeroRue = nvNumeroRue;
		this.libelleRue = nvLibelleRue;
		this.codePostal = nvCodePostal;
		this.ville = nvVille;

	}
	
	// cr�er une methode qui va afficher l'adresse

		public void adresseMethode() {

			System.out.println(numeroRue+" "+libelleRue+" "+codePostal+" "+ville);

		}

}

