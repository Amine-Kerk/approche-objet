package dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
	//jour/mois/annee
		Calendar cal = Calendar.getInstance();
		
		cal.set(2016,4,19,23,59,30);
		
		
		Date date = cal.getTime();
		
		SimpleDateFormat formateur =new SimpleDateFormat("dd/MM/YYYY");
		String chaine =formateur.format(date);
		System.out.println(chaine);
	//annee/mois/jour heure:minute:seconde
		Calendar calJour = Calendar.getInstance();
       Date date1 =calJour.getTime();
		
		
		SimpleDateFormat formateur1 =new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		String chaine1=formateur1.format(date1);
		
		System.out.println(chaine1);
	//Affichez la meme intance avec le nom des jours et des mois en fran�ais, russe, chinois et allemand.
	
		SimpleDateFormat formateurUS =new SimpleDateFormat("EEEEE/dd/MMMMM/yyyy HH:mm:ss",Locale.US);
		String chaine2=formateurUS.format(date1);
		
		System.out.println(chaine2);
		
		SimpleDateFormat formateurCH =new SimpleDateFormat("EEEEE/dd/MMMMM/yyyy HH:mm:ss",Locale.CHINA);
		String chaine3=formateurCH.format(date1);
		
		System.out.println(chaine3);
		
		SimpleDateFormat formateurGR =new SimpleDateFormat("EEEEE/dd/MMMMM/yyyy HH:mm:ss",Locale.GERMANY);
		String chaine4=formateurGR.format(date1);
		
		System.out.println(chaine4);
	}

}
