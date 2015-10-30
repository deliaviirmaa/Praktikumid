package praktikum7;

//Kirjutada kuulujutugeneraator.
//Kolm ühepikkust massiivi: Esimeses naisenimed, teises mehenimed, kolmandas tegusõnad.
//Programm võtab igast massiivist ÜHE suvalise elemendi ja kombineerib nendest lause.
//Vihje: Massivist suvalise elemendi valimiseks arvuta random number vahemikus 0 kuni massiivi pikkus (random * length).


public class KuulujutuGeneraator {
	public static void main(String[] args) {
		
	
	String[] naisteNimed = {"Mari","Pille","Laine","Kartu"};
	String[] meesteNimed = {"Kalle", "Kaspar", "Jyri","Aivar"};
	String[] tegevused = {"armastab", "vihkab", "petab", "kallistab"};
	
	// public static String suvalineElement(String[] massiiv)
	// git status (läbi lugeda), git add Praktikum7, git status, git commit, i - saan kirjutada kommentaari, väljumiseks esc
	// :X - salvestas ja läks välja, git push. // git pull (kodus saan selle võtta) git clone, kui pole seda kasutanud 
	// ja siis git pull /// pwd - näitab, kus kataloogis ma olen, siis cd
	
	System.out.println( naisteNimed[(int)(Math.random() *naisteNimed.length)] +" "+
			tegevused[(int)(Math.random()*tegevused.length)]+" "+
			 meesteNimed[(int)(Math.random()*meesteNimed.length)]);
	
	}
}
