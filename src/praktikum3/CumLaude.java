package praktikum3;

import lib.TextIO;

public class CumLaude {

	public static void main(String[] args) {

	

	double keskmineHinne;
	double loputooHinne;

	

	System.out.println("Palun sisesta oma keskmine hinne.");
	keskmineHinne = TextIO.getDouble();
	
	while (keskmineHinne < 0 || keskmineHinne > 5){
		System.out.println("Sisesta korrektne keskmine hinne.");
		keskmineHinne = TextIO.getDouble();
	}
	
	System.out.println("Palun sisesta oma loputoo hinne.");
	loputooHinne = TextIO.getInt();
	
	while (loputooHinne < 1 || loputooHinne > 5){
		System.out.println("Sisesta korrektne lõputöö hinne.");
		loputooHinne = TextIO.getDouble();
	}
	
	if (keskmineHinne > 4.5 && keskmineHinne <=5.0 && loputooHinne == 5){
		
		System.out.println("Jah saad cum laude diplomile");
	} else {
		System.out.println("Ei saa cum laude diplomile");
	}
	
	
	}
}
