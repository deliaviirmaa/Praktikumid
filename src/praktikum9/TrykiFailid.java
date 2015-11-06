package praktikum9;

import java.io.File;
import java.util.Arrays;

public class TrykiFailid {
	public static void main(String[] args) {
		trykiFailid("/home/dviirmaa/Documents/workspace/Praktikumid/src");
	}
	
	public static void trykiFailid(String kataloogiTee){
		File kataloog = new File(kataloogiTee);
        File[] failid = kataloog.listFiles();
        Arrays.sort(failid);

        for (File file : failid) {
        
            if (file.isDirectory()) {
                System.out.print("Kataloog: ");
                System.out.println();
                trykiFailid(file.getAbsolutePath());
            }
            else {
                System.out.print("Fail:     ");
            }
            System.out.println(file.getAbsoluteFile());
        }
	}

}
