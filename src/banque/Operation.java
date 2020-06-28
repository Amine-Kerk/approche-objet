package banque;

public abstract class Operation {

	private String date;
	private Double montant;
	
	
	
	public Operation(String date, Double montant) {
		super();
		this.date = date;
		this.montant = montant;
	}

	// methode objet pour la conversion de l' affichage 
	@Override
	public String toString() {
		return "date:" + getDate() + " montant: " + getMontant() + "";
	}
	
	
	//methode abstract
	public abstract String getType();
	

    //get et set
	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	public Double getMontant() {
		return montant;
	}



	public void setMontant(Double montant) {
		this.montant = montant;
	}



	
	
	
	
	
}
