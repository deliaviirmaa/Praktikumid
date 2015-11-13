package praktikum12;

public class Massiivid {
	public static void main(String[] args) {
		int [] massiiv = {1,2,3,4,5,6,7,8,9,0};
		int [][] maatriks = {
				{1, 1, 1, 1, 1},
				{2, 3, 4, 5, 6},
				{3, 4, 5, 6, 7},
				{4, 5, 6, 7, 8},
				{5, 6, 7, 8, 9},
		};
	//tryki(massiiv);
	//trykiKahemootmeline(maatriks);
	
		
		
	
		
	tryki(ridadeSummad(maatriks));
		
	}

	public static void tryki(int[] massiiv){   //trükib massiivi välja
		for(int i = 0; i<massiiv.length;i++){
			System.out.print(massiiv[i] + " ");
		}
	}
	public static void trykiKahemootmeline(int[][] maatriks){ // trükib välja kahemõõtmelise massiivi
		
		for (int i=0; i<maatriks.length;i++){
			tryki(maatriks[i]);
			System.out.println();
		}
		//System.out.println();
	}
	public static int[] ridadeSummad(int[][] maatriks){
		int[] summad = new int[maatriks.length];
		for(int i=0; i<maatriks.length; i++){
			summad[i]=reaSumma(maatriks[i]);
		}
		return summad;
	}
	public static int reaSumma(int[] rida){
		int summa=0;
		for(int i:rida){
			summa=summa+i;
		}
		return summa;
	}
}
