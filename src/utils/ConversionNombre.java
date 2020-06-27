package utils;

public class ConversionNombre {

	public static void main(String[] args) {
	
		
		String chaine = "1990";
		
		//appel de methode qui renvoi la valeur de notre chaine
		 int valeur = Integer.valueOf(chaine);
			
			System.out.println("la chaine contient : "+valeur);
		
		int a=784;
		int b=197;
		
		System.out.println(a+" "+b);
		
		
		//appel de methode qui calcule le max entre 2 entiers
		int resultat = Integer.max(a, b);
		System.out.println("le plus grand nombre est : "+resultat);
					
		}

	}


