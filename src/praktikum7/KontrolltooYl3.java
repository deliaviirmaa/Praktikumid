package praktikum7;

import java.util.ArrayList;
import java.util.Collections;

//Sportlase punktisumma arvutatakse üksikkatsetest saadud punktide summana, millest on maha võetud kahe 
//halvima katse tulemused (üksikkatseid on rohkem kui kaks). Kirjutada Java meetod, mis arvutab punktisumma 
//üksikkatsete tulemuste massiivi põhjal. Parameetriks olevat massiivi muuta ei tohi. 
//
//   public static int score (int[] points)

public class KontrolltooYl3 {
	
	public static void main(String[] args) {
		int [] points ={2,8,6,3,4,7,8,5,6};
		score(points);
		System.out.println(score(points));
	}
	public static int score (int[] points){
		
		int yksikKatseteArv=2;
		ArrayList<Integer> punktisummad = new ArrayList<Integer>();
		
		for (int i=1;i<points.length;i++){
			punktisummad.add(i);
			}
		Collections.sort(punktisummad);
		System.out.println(punktisummad);
		
		int summa=0;
		for(int i=yksikKatseteArv;i<punktisummad.size();i++){
			summa = summa + punktisummad.get(i);
			
		}
		
		
		return summa;
	}

}
