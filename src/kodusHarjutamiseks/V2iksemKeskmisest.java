package kodusHarjutamiseks;

//Koostage Java meetod, mis leiab etteantud reaalarvude massiivi d 
	 //põhjal niisuguste elementide arvu, mis on rangelt suuremad kõigi 
	 //elementide aritmeetilisest keskmisest 
	 //(aritmeetiline keskmine = summa / elementide_arv). 
	 
	 //public static int keskmisestParemaid (double[] d){

public class V2iksemKeskmisest {
	public static void main(String[] args) {
		
		double [] d = {1.0, 2.0, 1.0};
		
		System.out.println(keskmisestParemaid(d));
		
	}
	
	public static int keskmisestParemaid (double [] d){
		double summa = 0;
		
		for (int i=0; i < d.length; i++){
			
			summa = summa+d[i];
		}
		System.out.println(summa);
		double aritmeetilineKeskmine = summa / d.length;
		System.out.println(aritmeetilineKeskmine);
		
		int rangeltSuuremad = 0;
		
		for (int i=0; i< d.length; i++){
			if (d[i]>aritmeetilineKeskmine){
				rangeltSuuremad++;
			}
		}
		
		return rangeltSuuremad;
	}

}
