package testexceptions;

import sets.Pays;

public class TestReflectionUtils {

	public static void main(String[] args) {
		
		Pays pays = new Pays("France",555555,100);
	
		
		
		
			try {
				ReflectionUtils.afficherAttributs(pays);
			} catch (IllegalArgumentException  | IllegalAccessException |ReflectionException e) {
				System.out.println(e.getMessage());
			}
			
			try {
				ReflectionUtils.afficherAttributs(null);//interdit
			} catch (IllegalArgumentException  | IllegalAccessException| ReflectionException e) {
				System.err.println(e.getMessage());
			}
				
				
		

	}

}
