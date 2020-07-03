package utils;

import tpinterface.Cercle;

public class CercleFactory {

	public static Cercle builderCercle(double pray) {
		Cercle cer=new Cercle(pray);
		return cer;
		
	}

	
}
