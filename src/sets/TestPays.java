package sets;

import java.util.HashSet;

public class TestPays {

	public static void main(String[] args) {

		HashSet<Pays> setPays = new HashSet<>();

		setPays.add(new Pays("USA", 328.2, 62794.59));
		setPays.add(new Pays("France", 66.99, 41463.64));
		setPays.add(new Pays("Allemagne", 83.02, 47603.03));
		setPays.add(new Pays("UK", 66.65, 42943.90));
		setPays.add(new Pays("Italie", 60.36, 34483.20));
		setPays.add(new Pays("Japon", 126.5, 39289.96));
		setPays.add(new Pays("Chine", 1393.0, 9770.85));
		setPays.add(new Pays("Russie", 144.5, 11288.87));
		setPays.add(new Pays("Inde", 1353.0, 2009.98));

		// Recherchez le pays avec le PIB/habitant le plus important

		Pays paysReference = setPays.iterator().next();

		for (Pays pays : setPays) {

			if (pays.getpibParHabitant() > paysReference.getpibParHabitant()) {

				paysReference = pays;
			}
		}

		System.out.println("le pays avec le PIB/habitant le plus élevé :" + paysReference);
		System.out.println(
				"-----------------------------------------------------------------------------------------------------");
		// Recherchez le pays avec le PIB total le plus important

		Pays paysReferencePibTotal = setPays.iterator().next();

		for (Pays pays : setPays) {

			if (pays.getPibTotal() > paysReferencePibTotal.getPibTotal()) {

				paysReferencePibTotal = pays;

			}
		}

		System.out.println("le pays avec le PIB total le plus élevé :" + paysReferencePibTotal + " avec un pib de "
				+ paysReferencePibTotal.getPibTotal());
		System.out.println("---------------------------------------------------------------------------------------------");

		// Modifiez le contenu du HashSet pour mettre en majuscule le pays qui a le PIB total leplus petit
		Pays paysReferencePibTotalPetit = setPays.iterator().next();

		for (Pays pays : setPays) {

			if (pays.getPibTotal() < paysReferencePibTotalPetit.getPibTotal()) {

				paysReferencePibTotalPetit = pays;

				
				
			}
		}

		String nomEnMaj = paysReferencePibTotalPetit.toString().toUpperCase();
		paysReferencePibTotalPetit.setNom(nomEnMaj);

		for (Pays pays : setPays) {

			System.out.println(pays);
		}
		System.out.println("---------------------------------------------------------------------------------------------");

		// Supprimez le pays dont le PIB total est le plus petit
         setPays.remove(paysReferencePibTotalPetit);
		// Affichez l'enemble des pays ainsi modifiés avec leur nom, nombre  d'habitants et PIB total
         
         for (Pays paysModif : setPays) {

 			System.out.println(paysModif+" avec un PIB Total de :  "+paysModif.getPibTotal());
         
        	 
         }

	}
}
