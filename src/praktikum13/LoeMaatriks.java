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
