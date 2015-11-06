package praktikum9;

public class Astendamine {
	
	public static void main(String[] args) {
	System.out.println(astenda(2,3));
	}
	public static int astenda(int arv, int aste){
		// tingimus, mis juhul ma lõpetan väljakutsumise
		if (aste==1){
			return arv;
		} else {
		return arv*astenda(arv, aste-1);
		}
	}

}
