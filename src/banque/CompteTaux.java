package banque;


//une classe qui appelle un objet qui est notre clase Compte classe mére OU SUPER CLASS
//lors de la creation de la nouvelle classe comptetaux on fait la liaison avec classe compte
//depuis la fenetre de creation classes ce qui donne EXTENDS automatiquement 

public class CompteTaux extends Compte {
	
//attribut d'instance en privée respecter l'encapsulation
	private Double taux;
		
//nouveau constructeur en rajoutant le nouveau attribut "taux"
		
		public CompteTaux(String numCompte, Double soldeComte, Double taux) {
			super(numCompte, soldeComte);
			this.taux = taux;
		}
			
		
//appel à la methode to string qui retourne la methode de la classe mére compte "heritage"
		//avec le mot clé super. 
@Override
	public String toString() {
	
	return super.toString() +" "+ "taux = " + taux+" " ;
		}




		//getters et setters de notre nouvelle variable
		public Double getTaux() {
			return taux;
		}

		public void setTaux(Double taux) {
			this.taux = taux;
		}
		
	
	
}
