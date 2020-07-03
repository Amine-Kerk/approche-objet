package maps;

import java.util.ArrayList;
import java.util.HashMap;

public class ComptagePaysParContinent {

	public static void main(String[] args) {
//Créez une ArrayList de Pays contenant les pays suivants :
		ArrayList<Pays> list = new ArrayList<>();

		list.add(new Pays("France", 65, "Europe"));
		list.add(new Pays("Allemagne", 80, "Europe"));
		list.add(new Pays("Belgique", 10, "Europe"));
		list.add(new Pays("Russie", 150, "Asie"));
		list.add(new Pays("Chine", 1_400, "Asie"));
		list.add(new Pays("Indonesie", 220, "Océanie"));
		list.add(new Pays("Australie", 20, "Océanie"));
//Utilisez une HashMap pour réaliser un comptage du nombre de pays par continent

		System.out.println(list.toString());

		HashMap<String, Integer> comptage = new HashMap<>();
////boucle for qui rempli la map 

		for (Pays pays : list) {

			Integer compteur = comptage.get(pays.getContinent());
			if (compteur == null) {
				comptage.put(pays.getContinent(), 1);
			} else {
				compteur++;
				comptage.put(pays.getContinent(), compteur);

			}

		}
		System.out.println("le nombre de pays par continent est : "+comptage);

	}

}
