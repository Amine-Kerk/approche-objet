package essais;

import entites.Cercle;
import utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {

// deux nouvelles instances de cercle 
		Cercle cercle1 = new Cercle(15.8);
		Cercle cercle2 = new Cercle(45.9);

//appel des methodes pour afficher le resultat avec un nouveau attribut pour chaque instance d'objet
		
		double perimetre1=cercle1.calculPeriC();
		double surface1=cercle1.calculSurfC();
		
		double perimetre2=cercle2.calculPeriC();
		double surface2=cercle2.calculPeriC();
		
	    
		
//affichage des resultats		
		System.out.println("le cercle de rayon "+ cercle1.getRay()+" a un perimetre de "+
		perimetre1+" et une surface de "+surface1);
		System.out.println("le cercle de rayon "+ cercle2.getRay()+" a un perimetre de"+
		perimetre2+" et une surface de "+surface2);
		
		
		
		//appel a la methode static depuis la classe  pour creer un autre cercle 
		
		Cercle autreCercle=CercleFactory.builderCercle(50);
		
		
		
		System.out.println("Le cercle de rayon " + autreCercle.getRay() + " a un périmètre de " + autreCercle.calculPeriC() +
				" cm et une aire de " + autreCercle.calculSurfC());
		
        
	}


}
