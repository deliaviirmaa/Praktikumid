package praktikum7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//
//Kirjutada programm, mis laseb kasutajal sisestada senikaua nimesid, kui kasutaja sisestab nime asemel tühja rea. 
//Seejärel trükkida nimed ekraanile tähestikulises järjekorras. Vihje: selle ülesande kasutamiseks kasuta 
//ArrayList klassi. Sorteerimiseks kasuta Collections.sort() meetodit.
//ArrayList<String> nimed = new ArrayList<String>();
//nimed.add("Mati");
//for (String nimi : nimed) {
//    System.out.println(nimi);
//}

public class NimedeSisestamine {
	public static void main(String[] args) {
		ArrayList nimed = new ArrayList();
		
		Scanner scanner = new Scanner(System.in);
		//String sisestatudNimi = scanner.next();
		//System.out.println("Palun sisestage nimi.");
		String sisestatudNimi=null;
		do{
			System.out.println("Palun sisestage nimi.");
			sisestatudNimi =scanner.nextLine();
			if (!sisestatudNimi.equals("")){
			nimed.add(sisestatudNimi);
			}
//			if (sisestatudNimi==" "){
//				break;
//			}
		}while(!sisestatudNimi.equals(""));
		
		Collections.sort(nimed);
		System.out.println(nimed);
		System.out.println(nimed.size());
	
	}
	

}
