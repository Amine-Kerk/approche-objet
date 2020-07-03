package maps;

import java.util.ArrayList;
import java.util.HashMap;



public class MapVilles {

	public static void main(String[] args) {

		ArrayList<Ville> liste = new ArrayList<>();

		liste.add(new Ville("Nice", 343_000));
		liste.add(new Ville("Carcassonne", 47_800));
		liste.add(new Ville("Narbonne", 53_400));
		liste.add(new Ville("Lyon", 484_000));
		liste.add(new Ville("Foix", 9_700));
		liste.add(new Ville("Pau", 77_200));
		liste.add(new Ville("Marseille", 850_700));
		liste.add(new Ville("Tarbes", 40_600));

//boucle for qui rempli la map 

		HashMap<String, Ville> map = new HashMap<>();

		for (Ville ville : liste) {

			map.put(ville.getNom(), ville);

		}

		System.out.println(map);

//Recherchez et supprimez la ville qui a le moins d’habitants

		int min = liste.iterator().next().getNbhabitant();

		String villeMinHb = null;
		for (String key : map.keySet()) {
			int nbHabitans = map.get(key).getNbhabitant();
			if (nbHabitans < min) {

				villeMinHb = key;

				min = nbHabitans;
			}

		}

		map.remove(villeMinHb);
		System.out.println(map);
	}
}
