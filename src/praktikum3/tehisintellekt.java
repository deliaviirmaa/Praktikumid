package praktikum3;

import lib.TextIO;

public class tehisintellekt {
public static void main(String[] args) {
	int vanus1;
	int vanus2;
	
	System.out.println("Tere");
	System.out.println("Palun sisesta enda vanus.");
	vanus1 = TextIO.getInt();
	System.out.println("Palun sisesta oma peika vanus.");
	vanus2 = TextIO.getInt();
	int vanuseVahe = Math.abs(vanus1 - vanus2);
	if (vanuseVahe<5){
		System.out.println("Te sobite hästi.");
	}	else if (vanuseVahe > 5 && vanuseVahe<10){
		System.out.println("Pikas perspektiivis ei toimi.");
	}   else {
		System.out.println("Üks teist on liiga vana.");
	}

}
	
}
