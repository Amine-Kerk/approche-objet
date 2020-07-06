package recensement;

import java.util.*;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Application {

	public static void main(String[] args) {
		try {
			File file = new File("C:/temp/recensement population 2016.csv");
			List<String> lignes = FileUtils.readLines(file, "UTF-8");

//creation de la liste avec toutes les villes 
			ArrayList<Ville> listeVilles = new ArrayList<>();
//on commence par lindex 1 pour ignorer la premeire ligne du tableau excel
			for (int i = 1; i < lignes.size(); i++) {

				// On commence par découper la ligne en morceaux sur la base du caractère
				// séparateur « ; » . De plus on ne récupère que les morceaux qui nous
				// intéressent. En
				// l’occurrence on ignore les morceaux 3 et 4 dont on a pas besoin dans le TP
				String[] morceaux = lignes.get(i).split(";");
				String codeRegion = morceaux[0];
				String nomRegion = morceaux[1];
				String codeDepartement = morceaux[2];
				String codeCommune = morceaux[5];
				String nomCommune = morceaux[6];
				String population = morceaux[7];

				int populationTotale = Integer.parseInt(population.replace(" ", "").trim());

// On cree enfin la ville avec toutes les données utiles

				Ville ville = new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune,
						populationTotale);
//on alimente la liste par les données 
				listeVilles.add(ville);

			}
			
			
			

			String search = "Montpellier";
			
			Ville maville = new Ville();

			for (int i = 0; i < listeVilles.size(); i++) {

				if (listeVilles.get(i).getNomCommune().equals(search)) {

					maville = listeVilles.get(i);
				}
			}

			System.out.println(maville);
            System.out.println("-----------------------------------------------------------------");
            
            int nbPopHerault=0;
            for (int i = 0; i < listeVilles.size(); i++) {
            	if(listeVilles.get(i).getCodeDepartement().equals("34")) {
            		nbPopHerault=nbPopHerault+listeVilles.get(i).getPopulationTotale();
            	}
          
            }
            
            System.out.println("la population en Hérault est de :"+nbPopHerault);
            
            System.out.println("-----------------------------------------------------------------");
            
            
            
            
            
            
          
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
			System.out.println("Nombre de lignes :" + lignes.size());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
