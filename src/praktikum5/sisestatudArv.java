package praktikum5;

import lib.TextIO;

public class sisestatudArv {
	public static void main(String[] args) {
		System.out.println("Palun sisesta arv.");
		
		sisestatudArvuSobivus(5, 16);
		// double sisestatudArv = TextIO.getDouble();
	
	}

	public static boolean sisestatudArvuSobivus(double algus, double lopp) {
		double sisestatudArv = TextIO.getDouble();
		while (sisestatudArv < algus || sisestatudArv > lopp) {
			System.out.println("Proovi uuesti, sisesta uus arv.");
			sisestatudArv = TextIO.getDouble();
			return false;
		}
		System.out.println("Arv sobis etteantud vahemikku. Sisestatud arv oli:"+ sisestatudArv);
		return true;
	}

}
