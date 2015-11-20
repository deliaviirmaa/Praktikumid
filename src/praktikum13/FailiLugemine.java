package praktikum13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class FailiLugemine {
	public static void main(String[] args) {
		String kataloogitee = FailiLugemine.class.getResource(".").getPath();	
		System.out.println(kataloogitee);
		File file = new File(kataloogitee + "kala.txt");
		try{
			BufferedReader in = new BufferedReader(new FileReader(file));
			String rida;
			ArrayList<String> kaladeNimekiri = new ArrayList<String>();
			while ((rida=in.readLine()) !=null){
				kaladeNimekiri.add(rida);
			}
			Collections.sort(kaladeNimekiri);
			System.out.println(kaladeNimekiri);
		}
		catch (FileNotFoundException e){
			System.out.println("Faili ei leitud: "+e.getMessage());
		}
		catch (Exception e){
			System.out.println("Mingi jama");
		}
	}
}
