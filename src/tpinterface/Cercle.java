package tpinterface;

public class Cercle implements  ObjetGeometrique  {

	private double ray;
	
	
//constructeur avec un seul paramétre
	public Cercle(double ray) {
		
		this.ray = ray;
	}

//get et set de notre variable	
	public double getRay() {
		return ray;
	}

	public void setRay(double ray) {
		this.ray = ray;
	}

	// les methodes de calcule et affichage du resultat 
	
	
	public double calculPeri() {
		double perimetre = 2 * Math.PI * ray;
		return perimetre;

	}

	public double calculSurf() {
		double surface = ray * ray * Math.PI;
		return surface;
	}

	public String getType() {
		return "Cercle";
		}
}
