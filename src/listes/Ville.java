package listes;

public class Ville {
	
	private String Nom;
	private int nbhabitant;
	
	
	
	
	
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public int getNbhabitant() {
		return nbhabitant;
	}
	public void setNbhabitant(int nbhabitant) {
		this.nbhabitant = nbhabitant;
	}
	
	
	
	
	public Ville(String nom, int nbhabitant) {
		super();
		Nom = nom;
		this.nbhabitant = nbhabitant;
	}
	
	
	
	
	
	
	

}
