package banque;

public class TestBanque {
	
	

	public static void main(String[] args) {
		
		
		//créer un tableau de taille 2 
		Compte[] tabComptes = new Compte[2];
		tabComptes[0]=new Compte("5555",125.0);//compte normal
		tabComptes[1]=new CompteTaux ("6666",-15.0,0.15);//compte avec taux
		
		//boucle afin de parcourir notre tableau pour l'affichage
		for (int i=0;i<=tabComptes.length-1;i++) {
			
		System.out.println(tabComptes[0]);
			System.out.println(tabComptes[1]);
		}
		
		
		//instances des comptes
		
	//Compte	 compte1=new Compte("123456789",15000.00);
	//Compte   compte2=new Compte("987654321",20000.00);
	//Compte   compte3=new Compte("555555555",15.00);
	  //instances des taux dans comptetaux
   // Compte   taux1=new CompteTaux("123456789",15000.00,1.88);
    //Compte   taux2=new CompteTaux("123456789",15000.00,1.99);
   // Compte   taux3=new CompteTaux("123456789",15000.00,1.77);
   
   
	
	//System.out.println(compte1);
	//System.out.println(compte2);	
	//System.out.println(compte3);	
	//System.out.println();
	//System.out.println(taux1);
	//System.out.println(taux2);	
	//System.out.println(taux3);

	}

}
