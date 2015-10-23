package praktikum7;

import java.util.Scanner;
//Kirjutada programm, mis küsib kasutajalt 10 arvu ning trükib nad seejärel 
//vastupidises järjekorras ekraanile.

public class TenNumbers {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] arvud = new int[10];
		int indeks = 0;
		//System.out.println("Palun sisestage üks arv.");
		while (indeks<arvud.length) {
			System.out.println("Palun sisestage üks arv.");
			int arv = scanner.nextInt();
			System.out.println(indeks);
			arvud[indeks] = arv;
			indeks++;

		}
		
		for (int i = arvud.length-1; i>=0; i--) {
			System.out.print(arvud[i]+", ");
		}

	}
	// private static int askDigits(int arv){
	// while(TenNumbers.hasNextInt()){
	// int[] enteredNumbers=scanner.nextInt.add();
	// return 3;
	// }}
	// private static
}

// int [] arvud = new int [10] - niimoodi saab ära määrata massiivi pikkuse
// int[] arvud = {3,5,8,9} - niimoodi annan massiivile väärtuse
// arvud[0] = 7 - ütlen, et kohal 0 on arvu väärtus 7
// System.out.println(arvud) - nii ei saa massiivi välja trükkida, on vaja teha
// meetod
// for (int i=0; i< arvud.length; i++) {
// Systm.out.println(arvud[1]);
