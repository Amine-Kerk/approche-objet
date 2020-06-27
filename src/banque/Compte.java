package banque;

public class Compte {

	//attributs d'instances dans la r�gle de l'encapsulation "private"
	private String numCompte;
	private Double soldeComte;
	
//notre constructeur 
	
	public Compte(String numCompte, Double soldeComte) {
        super();
        
		this.numCompte = numCompte;
		this.soldeComte = soldeComte;
	}
	
	//methode qui transforme une instance de compte en string
	//cette methode nous l'avons recup�r�e depuis methode objet 
	//que nous avons transform� en rajoutant @Override pour le signaler 
	
	@Override
	public String toString() {
	return "numCompte=" + numCompte + ", soldeComte=" + soldeComte+" Euro";
	}

//les setters et getters de nos variables
	public String getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}

	public Double getSoldeComte() {
		return soldeComte;
	}

	public void setSoldeComte(Double soldeComte) {
		this.soldeComte = soldeComte;
	}

}
