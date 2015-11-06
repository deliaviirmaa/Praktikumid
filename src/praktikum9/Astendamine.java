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


// pwd - käsk, mis näitab, kus ma olen
// ls - näitab, mis on seal kausta sees
// cd ja kausta nimi - saan minna sinna kausta, kuhu tahan minna
// git status - vaatan, mis on seal kausta sees
// git add . - lisan kõik uued failid
// kirjutan kommentaari
// esc - saan kommentaari lõpetada
// :wq - saan tagasi
// git status - kontrollin, kas kõik on lisatud 
// git push - lisan git-i 
