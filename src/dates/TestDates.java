package dates;

import java.text.SimpleDateFormat;

import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		
// attention intance oldschool ("deprecation")
		Date dateDuJour = new Date(120, 6, 8);

		// jour/mois/année

		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/YYYY");
		String chaine = formateur.format(dateDuJour);

		System.out.println(chaine);

		// Creez une instance de la classe Date � la date du 19 mai 2016 � 23h59 et
		// 30secondes

		Date date = new Date(116, 4, 19, 23, 59, 30);
		SimpleDateFormat formateur1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String chaine1 = formateur1.format(date);
		// Affichez l'instance ainsi creee au format suivant : annee/mois/jour
		// heure:minute:seconde
		System.out.println(chaine1);
		// Creez une instance de Date contenant la date/heure systeme et affichez-la au
		// meme format que ci-dessus

		Date dateSystem = new Date();

		String chaine2 = formateur1.format(dateSystem);
		System.out.println(chaine2);

	}

}
