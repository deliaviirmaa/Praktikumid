package praktikum2;

import lib.TextIO;

public class nimi {
	// main meetodi shortcut, kirjutan main ja siis vajutan Ctrl+tühik
	public static void main(String[]args){
		String name;
		int age;
		int number;
		System.out.println("Sisesta nimi.");
		name = TextIO.getlnString();
		System.out.println("Kui vana Sa oled?");
		age = TextIO.getlnInt();
		System.out.println("Mis on su kinga suurus");
		number = TextIO.getInt();
		System.out.println("Sinu nimi on "+name);
		System.out.println("Sa oled "+age+" aastane");
		System.out.println("Sinu kinganumber on "+number);
	}

}
