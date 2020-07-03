package tpinterface;

public class Rectangle implements  ObjetGeometrique {

	private double longeur;
	private double largeur;

	//constructeur avec deux paramétres 
	public Rectangle(double longeur, double largeur) {

		this.longeur = longeur;
		this.largeur = largeur;
	}

	
//methodes pour calcul du perimetre et de la surface 
	public double calculPeri() {
		double perimetre = (largeur + longeur) * 2;
		return perimetre;
	}
	public double calculSurf() {
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


	public String getType() {
		return "Rectangle";
		}
	
}
