package entites;



public class CompteBancaire {

	
	
	private String numCompte;
	private Double solde;
	private Personne Proprietaire;
	
	//constructeur à 3 paramétres
	public CompteBancaire(String numCompte, Double solde, Personne proprietaire) {
		this.numCompte = numCompte;
		this.solde = solde;
		this.Proprietaire = proprietaire;
	}
	
//methodes pour debiter et crediter un montant
	
		public double CrediterMontant(double montant) {
			return solde= solde + montant;
		} 
		
		public double DebiterMontant(double montant) {
			return solde= solde + montant;	
		}

		
//redefinition de la methode to string pour avoir un affichage correct 	
@Override
		public String toString() {
			return " COMPTE: " + numCompte + " SOLDE: " + solde 
					+ " PROPRIETAIRE: " +Proprietaire.nom+" "+Proprietaire.prenom;
					                     
		}	
		
		
		
		
		
		
//setters et getters
		

		public String getNumCompte() {
			return numCompte;
		}

		public void setNumCompte(String numCompte) {
			this.numCompte = numCompte;
		}

		public Double getSolde() {
			return solde;
		}

		public void setSolde(Double solde) {
			this.solde = solde;
		}

		public Personne getProprietaire() {
			return Proprietaire;
		}

		public void setProprietaire(Personne proprietaire) {

            this.Proprietaire = proprietaire;
		}
	
	
	

 

	
	
	
	
	
		
	
	
	
	
}
