package operations;

/** 
  
  renvoie un calcul effectu� sur les deux param�tres a et b en fonction du 3�me param�tre op 
 
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
