package sets;

import java.util.HashSet;

public class TestSetString {

	public static void main(String[] args) {

		HashSet<String> monSet = new HashSet<>();

		monSet.add("USA");
		monSet.add("France");
		monSet.add("Allemagne");
		monSet.add("UK");
		monSet.add("Italie");
		monSet.add("Japon");
		monSet.add("Chine");
		monSet.add("Russie");
		monSet.add("Inde");
		System.out.println(monSet);
		System.out.println("-----------------------------------------------------------------------");
		// Recherchez le pays dans cette liste qui a le plus grand nombre de lettres

		String bigTownLetters = "";
		for (String newSet : monSet) {
			if (newSet.length() > bigTownLetters.length()) {

				bigTownLetters = newSet;

			}

		}

		System.out.println("la ville au plus grand nombre de lettres est : " + bigTownLetters);
		System.out.println("-----------------------------------------------------------------------");
		// Supprimez ce pays

		monSet.remove(bigTownLetters);

		// Affichez enfin le contenu de la collection ainsi modifiée

		System.out.println("mon nouveau set est : " + monSet);

	}

}
