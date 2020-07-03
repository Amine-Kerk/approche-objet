package tpinterface;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		
		ObjetGeometrique [] tabogeo = new ObjetGeometrique[2];
		
		
		tabogeo[0]= new Cercle(5.0);
		tabogeo[1]= new Rectangle(1.0,2.0);
		
	
		
		for (int i=0 ; i<tabogeo.length;i++) {
			
			
			System.out.println("le perimetre "+tabogeo[i].getType()+" "+tabogeo[i].calculPeri());
			System.out.println("la surface "+tabogeo[i].getType()+" "+tabogeo[i].calculSurf());
		}
	
		
		
	}

}
