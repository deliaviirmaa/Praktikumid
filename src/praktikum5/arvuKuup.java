package praktikum5;

import lib.TextIO;

public class arvuKuup {
	public static void main(String[] args) {
		System.out.println("Palun sisesta arv, mille kuupi soovid teada saada.");
		double arv = TextIO.getDouble();
		System.out.println(arvuKuup(arv));
	
	}
	
	public static double arvuKuup (double arv){
		double vastus = Math.pow(arv, 3);
		return vastus;
	}

}
