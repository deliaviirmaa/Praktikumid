package praktikum7;

//Koostage Java meetod, mis leiab etteantud reaalarvude massiivi d põhjal niisuguste elementide arvu, 
//mis on rangelt suuremad kõigi elementide aritmeetilisest keskmisest (aritmeetiline keskmine = summa / elementide_arv). 

//   public static int keskmisestParemaid (double[] d)

public class Kontrolltoo2 {
	
	public static void main(String[] args) {
		double [] d = {5,6,8,2,3,4};
		System.out.println(keskmisestParemaid(d));
		
	}
		
		public static int keskmisestParemaid (double[] d){
		
		
		double summa = 0;
		for(int i=0; i<d.length;i++){
			double element = d[i];
			summa = summa + element;
		}
		double aritmeetilineKeskmine = summa / d.length;
		int suuremateElementideArv=0;
		for (int i=0; i<d.length;i++){
			double element = d[i];
			if(element>aritmeetilineKeskmine){
				suuremateElementideArv++;
			}
		}
		return suuremateElementideArv;
		
	}

}
