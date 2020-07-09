package sets;

public class TestEqualsPays {

	public static void main(String[] args) {
		// TODO tester la methode equals avec des nouveaux objets avec des attributs différents

		Pays pays1= new Pays ("aaa",5555555,666666);
		Pays pays2= new Pays ("aaa",5555555,666666);
		
		System.out.println(pays1.equals(pays2)); //il faut utiliser equals pour comparer 2 objets et non pas ==
	}

}
