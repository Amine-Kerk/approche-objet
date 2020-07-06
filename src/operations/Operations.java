package operations;

/** 
  
  renvoie un calcul effectué sur les deux paramétres a et b en fonction du 3éme paramétre op 
 
 */
public class Operations {
	
	public static double calcul(double a, double b, char op) {
		double resultat = 0;
		if (op == '+') {
			return a + b;
		} else if (op == '-') {
			return a - b;
		} else if (op == '*') {
			return a * b;
		} else if (op == '/') {
			return a / b;
		}
		return resultat;

	}

}
