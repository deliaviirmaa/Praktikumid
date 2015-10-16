package praktikum2;

import lib.TextIO;

public class sisestuseAsendamine {
	public static void main(String[] args) {
		String text;
		String replacement;
		
		System.out.println("Sisesta tekst.");
		text = TextIO.getln();
		replacement = text.replace('a','_');
		System.out.println("Uus sõna on: "+replacement);
	}
}
