package praktikum8;
//Kirjutada programm, mis küsib kasutaja käest kümme sõna ja trükib välja sõna pikkuse ja sõna enda.

import java.util.Scanner;

public class S6naPikkus {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] s6nad = new String[10];
		int indeks = 0;

		while (indeks < s6nad.length) {
			System.out.println("Palun sisestage sõna.");
			String sisestatudS6na = scanner.nextLine();
			int s6naPikkus = sisestatudS6na.length();
			s6nad[indeks] = s6naPikkus +" "+ sisestatudS6na;
			indeks++;
		}
	for(int i=0;i<s6nad.length;i++){
		System.out.println(s6nad[i]);
	}

	}

}
