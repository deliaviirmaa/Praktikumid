package praktikum14;

public class Punkt {
	
	int x;
	int y;
	// teen konstruktormeetodi (vajutan ctrl+space
	public Punkt(int x, int Y) {   // kirjutan sellepärast this, et mõtlesen seda maatodi sisest muutujat, 
		//mis ette antakse)
		this.x = x;
		this.y = y;
	}
	public Punkt() {
		// TODO Auto-generated constructor stub
		//luuakse punkt, ilma koordinaate lisamata
	}
	//on vaja teha toString meetod, et printida objekti
	@Override  // @ märgiga on annutatsioonid, kirjutab teise meetodi üle. See on vihje eclipsile, 
	// et see meetod peab üle kirjutama ülemklassist objekti
	public String toString() {
		
		return "Punkt(x="+x+", y="+y+")";  
	}
}
