package praktikum13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LoeMaatriks {
	public static void main(String[] args) throws IOException {
		String kataloogitee = LoeMaatriks.class.getResource(".").getPath();
		
		
		
		
		
		File file = new File(kataloogitee+"maatriks.txt");
		try {
			BufferedReader loen = new BufferedReader(new FileReader(file));
			String rida;
			while((rida=loen.readLine()) !=null){
				System.out.println(rida);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Seda faili täna ei ole."+e.getMessage());
			e.printStackTrace();
		}
		
	}

}

//public static ArrayList<String> loeFail(String failinimi) {
//	
//	ArrayList<String> read = new ArrayList<String>();
//	File file = new File(failinimi);
//	try {
//		// avame faili lugemise jaoks
//		BufferedReader in = new BufferedReader(new FileReader(file));
//		String rida;
//		
//		// loeme failist rida haaval
//		while ((rida = in.readLine()) != null) {
//			read.add(rida);
//		}
//	}
//	catch (FileNotFoundException e) {
//		System.out.println("Faili ei leitud: \n" + e.getMessage());
//	}
//	catch (Exception e) {
//		System.out.println("Error, jee, mingi muu error: " + e.getMessage());
//	}
//	return read;
