package praktikum8;
//Kirjutada programm, mis küsib kasutaja käest sõna ning trükib välja selle sõna suurte tähtedega ning tähed sidekriipsudega eraldatud.

//Näiteks, kui kasutaja sisestab "Teretore", trükib programm "T-E-R-E-T-O-R-E".

import java.util.Scanner;

public class KysiS6na {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Palun sisesta sõna.");
		String sisestatudS6na = scanner.nextLine();
		sisestatudS6na = sisestatudS6na.toUpperCase();
		System.out.println(sisestatudS6na);
		int s6naPikkus = sisestatudS6na.length();

		for (int i = 0; i < s6naPikkus; i++) {

			if (i == sisestatudS6na.length() - 1) {
				System.out.print(sisestatudS6na.charAt(i));
			} else {
				System.out.print(sisestatudS6na.charAt(i) + "-");
			}
		}

	}

}
