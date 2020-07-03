package tri;

public class Ville implements Comparable<Ville> {

	private String nom;
	private int nbhabitant;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbhabitant() {
		return nbhabitant;
	}

	public void setNbhabitant(int nbhabitant) {
		this.nbhabitant = nbhabitant;
	}

	public Ville(String nom, int nbhabitant) {
		super();
		this.nom = nom;
		this.nbhabitant = nbhabitant;
	}

	@Override
	public String toString() {
		return "Ville [Nom=" + nom + ", nbhabitant=" + nbhabitant + "]";
	}

	/* appelle a la fonciton compare to pour trier les strings */
	

	// public int compareTo(Ville autre) {

	// return this.Nom.compareTo(autre.getNom());

	

	//methode compare les nombre dhabitants

	
	@Override
	public int compareTo(Ville autre) {
		
		if (this.nbhabitant > autre.getNbhabitant()) {
			return 1;
		}
		if (this.nbhabitant < autre.getNbhabitant()) {
			return -1;
		}
		return 0;
		
		//public int comapreTo(Ville autre) {
		//return this.nnhabitant - autre.getnbhabitant());
		
	}

}

