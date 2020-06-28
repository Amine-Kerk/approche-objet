package banque;

public class TestOperation {

	public static void main(String[] args) {
		
		
		
		Operation [] tabOperations= new Operation[4];
		
		
		tabOperations [0]=new Credit  ("10/10/2001",10.0);
		tabOperations [1]=new Debit   ("11/12/2002",100.0);
		tabOperations [2]=new Credit  ("12/5/2003" ,20.0);
		tabOperations [3]=new Debit   ("13/01/2014",100.0);
		
		double montantG=0;
		
		
		for(int i=0;i< tabOperations.length;i++) {
			
			System.out.println(tabOperations[i]);
			System.out.println(tabOperations[i].getType());
			
			if (tabOperations[i].getType().equals("Credit")) {
				
					
			montantG=montantG+tabOperations[i].getMontant();
		
			}else {
				
				montantG=montantG-tabOperations[i].getMontant();
				
			}
			
		}

		System.out.println("le montant global est : "+montantG);
	
	}
	
	}
