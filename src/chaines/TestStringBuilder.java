package chaines;



public class TestStringBuilder {

	public static void main(String[] args) {

		// Dans cette classe, ajoutez tous les nombres de 1 � 100 000 dans une instance
		// de StringBuilder

		long debut = System.currentTimeMillis();
		StringBuilder builder = new StringBuilder();
		for (int i = 1; i < 100001; i++) {

			builder.append(i);
		}

		long fin = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes :" + (fin - debut));
//sans le builder
		long debut1 = System.currentTimeMillis();
		String d = "";
		for (int i = 1; i < 100001; i++) {

			d = d + i;
		}

		long fin1 = System.currentTimeMillis();

		System.out.println("Temps écoulé en millisecondes sans builder : " + (fin1 - debut1));

	
	}

}
