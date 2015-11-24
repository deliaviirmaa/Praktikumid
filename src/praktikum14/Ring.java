package praktikum14;

public class Ring {
	Punkt keskPunkt;
	double raadius;
	public Ring(Punkt x, int r) {
		keskPunkt = x;
		raadius = r;
	}
	public double pindala(){
		return 3.14*Math.pow(raadius, 2);
	}
	public double ymbermoot (){
		return 2*3.14*raadius;
	}

}
