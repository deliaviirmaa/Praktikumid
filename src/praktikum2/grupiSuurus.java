package praktikum2;

import lib.TextIO;

public class grupiSuurus {
	public static void main(String[] args) {
		int numberOfPeople;
		int peopleInGroup;
		int numberOfGroups;
		int reminder;
		
		System.out.println("Kui palju inmesi on kokku?");
		numberOfPeople = TextIO.getInt();
		System.out.println("Mitu inimest peaks olema ühes grupis?");
		peopleInGroup = TextIO.getInt();
		numberOfGroups = numberOfPeople / peopleInGroup ; 
		reminder = numberOfPeople % peopleInGroup;
		System.out.println("Inimestest saab moodustada "+numberOfGroups+ " gruppi. Üle jääb "+reminder+" inimest");
	}
}
