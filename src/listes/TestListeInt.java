package listes;

import java.util.*;

public class TestListeInt {

	public static void main(String[] args) {

		List<Integer> liste0 = Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5);
		List<Integer> liste1 = new ArrayList<>();
		liste1.addAll(liste0);
//Affichez tous les éléments de la liste
		System.out.println(liste1);
//Affichez la taille de la liste

		System.out.println("la taille de la liste est: " + liste1.size());
//Recherchez et affichez le plus grand élément de la liste

		int max = liste1.get(0);

		for (int i = 0; i < liste1.size() - 1; i++) {
			if (liste1.get(i) > liste1.get(i + 1)) {
				max = liste1.get(i);

			}

		}

		System.out.println("la valeur max est : " + max);
//chercher la valeur min de la list est la supprimer

		Iterator<Integer> iter = liste1.iterator(); // notre itérator pointe avant la liste

		Integer min = liste1.iterator().next(); // l'iterator pointe sur la valeur next // ou get(0)

		while (iter.hasNext()) {

			Integer element = iter.next();

			if (element < min) {

				min = element;
			}
		}

		liste1.remove(min);

		System.out.println(liste1);

		// Recherchez tous les éléments négatifs et modifiez les de manière à ce qu’ils
		// deviennent positifs.

		for(int i=0 ;i<liste1.size();i++) {
			
			if (liste1.get(i)<0) {
				
				liste1.set(i, -liste1.get(i));
			}
			
			
		}
		

		System.out.println(liste1);
		
		
	}

}
