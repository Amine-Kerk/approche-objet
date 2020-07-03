package listes;
import java.util.*;
public class CreationListe {

	public static void main(String[] args) {
		
		List<Integer> liste = new ArrayList<Integer>();
		
//remplir et afficher une liste de nombre de 1 à 100	
		
		for(int i=0;i<=99;i++) {
			
			liste.add(1+i);
		}
		
System.out.println(liste);
		
		
	}

}
