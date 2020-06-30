package entites;

public class Rectangle {

	private double longeur;
	private double largeur;

	//constructeur avec deux paramétres 
	public Rectangle(double longeur, double largeur) {

		this.longeur = longeur;
		this.largeur = largeur;
	}

	
//methodes pour calcul du perimetre et de la surface 
	public double calculPeriR() {
		double perimetre = (largeur + longeur) * 2;
		return perimetre;
	}
	public double calculSurfR() {
		double surface = longeur * largeur;
		return surface;
	}

	
	
	
	
	public double getLongeur() {
		return longeur;
	}

	public void setLongeur(double longeur) {
		this.longeur = longeur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
}
