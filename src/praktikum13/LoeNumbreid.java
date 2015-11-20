package praktikum13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LoeNumbreid {
	public static void main(String[] args) throws IOException {
		String kataloogitee = LoeNumbreid.class.getResource(".").getPath();
		
		File file = new File (kataloogitee + "numbrid.txt");
		try {
			BufferedReader loen = new BufferedReader(new FileReader(file));
			ArrayList<Integer> numbrid = new ArrayList<Integer>();
			String rida;
			double summa=0;
			double keskmine;
			while((rida=loen.readLine()) !=null){
				numbrid.add(Integer.parseInt(rida));
				summa = summa+(Integer.parseInt(rida));
				//double nr = Double.parseDouble(line);
			}
			System.out.println(summa);
			int numbreid = numbrid.size();
			System.out.println(numbrid.size());
			keskmine=summa/numbreid;
			System.out.println(keskmine);
			
		} catch (FileNotFoundException e) {
			System.out.println("Fail on hoopis teises kohas"+e.getMessage());
			e.printStackTrace();
		}
	}

}
