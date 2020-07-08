package sets;

public class Pays {

	private String nom;
	private double nbHabitants;
	private double pibParHabitant;

	public Pays(String nom, double nbHabitans, double pibParHabitant) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitans;
		this.pibParHabitant = pibParHabitant;
	}

	@Override
	public String toString() {
		return "nom=" + nom + ", nbHabitans=" + nbHabitants + ", PibParHabitant=" + pibParHabitant;
	}
	
	//methode de calcul pib total 
	public double getPibTotal( ) {
		
		return pibParHabitant*nbHabitants;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getNbHabitans() {
		return nbHabitants;
	}

	public void setNbHabitans(int nbHabitans) {
		this.nbHabitants = nbHabitans;
	}

	public double getpibParHabitant() {
		return pibParHabitant;
	}

	public void setpibparHabitant(int pibParHabitant) {
		this.pibParHabitant = pibParHabitant;
	}

}
