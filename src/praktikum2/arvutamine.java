package praktikum2;

import lib.TextIO;

public class arvutamine {
	public static void main(String[]args){
		int firstNumber;
		int secondNumber;
		int multiplication;
		System.out.println("Sisesta esimene arv.");
		firstNumber = TextIO.getInt();
		System.out.println("Sisesta teine arv.");
		secondNumber = TextIO.getInt();
		multiplication = firstNumber*secondNumber;
		System.out.println("Kahe arvu korrutis on: "+multiplication);
	}
}
