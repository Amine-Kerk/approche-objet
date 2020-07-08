package sets;

import java.util.Collections;
import java.util.HashSet;

public class TestSetDouble {

	public static void main(String[] args) {
	
		HashSet<Double> monSet = new HashSet<>();
		
	monSet.add(1.5);
	monSet.add(8.25);
	monSet.add(-7.32);
	monSet.add(13.3);
	monSet.add(-12.45);
	monSet.add(48.5);
	monSet.add(0.01);
	//Affichez tous les éléments de la collection
	
	System.out.println(monSet);
	System.out.println("----------------------------------------------------------");
	//Recherchez le plus grand élément de la collection
	
	
	double max =Collections.max(monSet);	
	System.out.println(max);

	//Supprimez le plus petit élément de la collection
		
		double min=Collections.min(monSet);
		monSet.remove(min);
	
	//Affichez enfin le contenu de la collection ainsi modifiée
	System.out.println("----------------------------------------------------------");
	System.out.println(monSet);
	
	
	}

}
