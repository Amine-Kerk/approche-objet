package utils;

import entites.Cercle;

public class CercleFactory {

	public static Cercle builderCercle(double ray) {
		return new Cercle(ray);
		
	}

	
}
