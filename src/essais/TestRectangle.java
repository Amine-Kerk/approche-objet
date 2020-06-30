package essais;

import entites.Rectangle;

public class TestRectangle {

	public static void main(String[] args) {
		
		//les nouveaux instances de notre objet 
		Rectangle r1 = new Rectangle (20.0,15.0);
		Rectangle r2 = new Rectangle (50.5,100.2);
		
		//les nouveaux attributs d'instance objet 
		
		double perimetre1=r1.calculPeriR();
		double surface1=r1.calculSurfR();
		
		double perimetre2=r2.calculPeriR();
		double surface2=r2.calculSurfR();
		
		System.out.println("le rectangle de largeur "+r1.getLargeur()+" et de longeur "+r1.getLongeur()+" a un perimétre de " 
				+perimetre1+" et une surface de "+surface1);
		
		System.out.println("le rectangle de largeur "+r2.getLargeur()+" et de longeur "+r2.getLongeur()+" a un perimétre de " 
				+perimetre2+" et une surface de "+surface2);
		
		
		
		
		
		
		

	}

}
