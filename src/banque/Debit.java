package banque;

public class Debit extends Operation {

	
	public Debit(String date,Double montant) {
		super(date,montant);
	}
	//redefinition de la methode get type qui retourne debit
	
	public String getType() {
		
		return "DEBIT";
	}
	

	
	

}
