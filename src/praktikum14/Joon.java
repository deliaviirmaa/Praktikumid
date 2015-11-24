package praktikum14;

public class Joon {
	
	Punkt algPunkt;      // see on Punkt tüüpi muutuja
	Punkt l6ppPunkt;
	// teen uue konstruktori
	public Joon(Punkt x, Punkt y) {
		algPunkt = x;
		l6ppPunkt = y;
	}
	
	// defineerin joone pikkuse
	public double pikkus(){
		return Math.sqrt(Math.pow(l6ppPunkt.y-algPunkt.y, 2)+ Math.pow(l6ppPunkt.x-algPunkt.x, 2));
		
	}
	
	@Override
	public String toString() {
		
		return "Joon punktist "+algPunkt+" kuni punktini"+l6ppPunkt;
	}


}
