package banque;

public class Credit extends Operation {

	public Credit(String date, Double montant) {
		super(date, montant);
		
	}

	
	//redefinition de la methode get type qui retourne credit

	public String getType() {
		
		return "CREDIT";
	}

	
	
}



