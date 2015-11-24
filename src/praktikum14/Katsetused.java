package praktikum14;

public class Katsetused {
	public static void main(String[] args) {
		// loon uue punkt tüüpi objekti
		Punkt minuPunkt = new Punkt();
		minuPunkt.x=40;
		minuPunkt.y=100;
		// hetkel sellist konstruktorit ei ole, mis lubaks sisestada 2 argumenti. Pean ise tegema sellise
		Punkt veelYksPunkt=new Punkt (100,200);
		System.out.println(minuPunkt);
		Joon minuJoon = new Joon(minuPunkt, veelYksPunkt);
		System.out.println(minuJoon.pikkus());
		System.out.println();
		Ring minuRing = new Ring(new Punkt(100, 200), 5);
		System.out.println(minuRing.pindala());
		System.out.println(minuRing.ymbermoot());
	}
	//kõikidel objektidel on olemas toString meetod, et seda välja trükkida

}
