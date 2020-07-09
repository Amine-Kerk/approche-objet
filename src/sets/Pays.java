package sets;

import org.apache.commons.lang3.builder.EqualsBuilder;

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

//Redéfinissez la méthode equals de la classe Pays du TP sur les sets
	// en utilisant la classe EqualsBuilder
	@Override

	public boolean equals(Object obj) {
		if (!(obj instanceof Pays)) {

			return false;
		}

		Pays other = (Pays) obj; // downcasting
		
		return new EqualsBuilder().append(this.nom, other.getNom()).append(this.nbHabitants, other.getNbHabitans())
				.append(this.pibParHabitant, other.getpibParHabitant()).isEquals();//is Equals elle fournie le resultat true ou false

	}

	// methode de calcul pib total
	public double getPibTotal() {

		return pibParHabitant * nbHabitants;
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
