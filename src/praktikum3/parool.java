package praktikum3;

import lib.TextIO;

public class parool {
public static void main(String[] args) {
	String oigeParool = "kaisukaru";
	String pakutudParool;
	
	System.out.println("Palun sisesta parool.");
	pakutudParool = TextIO.getlnString();
	
		while (!pakutudParool.equals(oigeParool)){
			System.out.println("Palun sisesta parool.");
			pakutudParool = TextIO.getlnString();
		}
		System.out.println("Sisestasid õige parooli. Palju õnne!");
		
}
}
