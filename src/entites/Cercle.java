package entites;

public class Cercle {

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
	
	
	public double calculPeriC() {
		double perimetre = 2 * 3.14 * ray;
		return perimetre;

	}

	public double calculSurfC() {
		double surface = ray * ray * 3.14;
		return surface;
	}
	
	
}
