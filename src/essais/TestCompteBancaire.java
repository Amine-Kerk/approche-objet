package essais;

import entites.CompteBancaire;
import entites.Personne;

public class TestCompteBancaire {

	public static void main(String[] args) {

		Personne pers1 = new Personne("Amine", "Kerkoub");
		CompteBancaire compte1 = new CompteBancaire("ABCD123", 500.0, pers1);

		System.out.println(compte1);

	}

}
