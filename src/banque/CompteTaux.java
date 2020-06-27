package banque;


//une classe qui appelle un objet qui est notre clase Compte classe m�re OU SUPER CLASS
//lors de la creation de la nouvelle classe comptetaux on fait la liaison avec classe compte
//depuis la fenetre de creation classes ce qui donne EXTENDS automatiquement 

public class CompteTaux extends Compte {
	
//attribut d'instance en priv�e respecter l'encapsulation
	private Double taux;
		
//nouveau constructeur en rajoutant le nouveau attribut "taux"
		
		public CompteTaux(String numCompte, Double soldeComte, Double taux) {
			super(numCompte, soldeComte);
			this.taux = taux;
		}
			
		
//appel � la methode to string qui retourne la methode de la classe m�re compte "heritage"
		//avec le mot cl� super. 
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
