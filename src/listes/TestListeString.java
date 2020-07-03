package listes;

import java.util.*;

public class TestListeString {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add(new String("Nice"));
		list.add(new String("Carcassonne"));
		list.add(new String("Narbonne"));
		list.add(new String("Foix"));
		list.add(new String("Pau"));
		list.add(new String("Marseille"));
		list.add(new String("Tarbes"));

// Recherchez la ville dans cette liste qui a le plus grand nombre de lettres
		
		String large = "";
		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).length() > large.length()) {

				large = list.get(i);
			}
		}

		System.out.println("la ville la plus longue est : " + large);
//Modifiez le contenu de la liste de manière à mettre tous les noms de villes en majuscules.

		for (int i = 0; i < list.size(); i++) {

			list.set(i, list.get(i).toUpperCase());

		}

		System.out.print(list);
//Supprimez de la liste les villes dont le nom commence par la lettre N.

		Iterator<String> iter = list.iterator();

		while (iter.hasNext()) {//tant que il me reste des element dans mon iterator

			String ville = iter.next(); // la valeur d'apres

			if (ville.startsWith("N")) {

				iter.remove();

			}

		}
        System.out.println();
		System.out.println(list);

	}

}
