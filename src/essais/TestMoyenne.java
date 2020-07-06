package essais;

import operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		//nouvelle instance de CalculeMoyenne en l'appelant par sa methode
		CalculMoyenne calculateurMoyenne = new CalculMoyenne() ;
		//ajouter les nombres en l'appelant par la methode ajout
		calculateurMoyenne.ajout(15);
		calculateurMoyenne.ajout(16);
        calculateurMoyenne.ajout(17);
        
        double resultat = calculateurMoyenne.calcul();
        
        System.out.println("la moyenne est :"+resultat);
	}

}
