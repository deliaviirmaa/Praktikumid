package praktikum2;

import lib.TextIO;

public class nimePikkus {
	public static void main(String[] args) {
		int numberOfLetters;
		String name;
		
		System.out.println("Mis Su nimi on?");
		name = TextIO.getln();
		numberOfLetters = name.length();
		System.out.println("Sinu nimes on "+numberOfLetters+" tähte.");
	}
}
