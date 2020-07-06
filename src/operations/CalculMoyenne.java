package operations;

public class CalculMoyenne {

	private double[] tab;

	public CalculMoyenne() {

		this.tab = new double[0];
	}

	public void ajout(double aAjouter) {

		// creation d'un tableau temporaire qui à la taille tab +1

		double[] newtab = new double[tab.length + 1];

		// on déverse les valeurs de tab dans newtab

		for (int i = 0; i < tab.length; i++) {

			newtab[i] = tab[i];
		}

		// on place le nouveau nombre dans le nouveau tableau

		newtab[newtab.length - 1] = aAjouter;

		this.tab = newtab;
	}
       //calcul de la moyenne du tableau
	
	public double calcul() {
		double somme = 0;

		for (int i = 0; i < tab.length; i++) {

			somme = somme + this.tab[i];
		}

		return (somme / this.tab.length);
	}
}
