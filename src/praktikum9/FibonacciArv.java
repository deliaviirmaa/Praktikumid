package praktikum9;

public class FibonacciArv {
	public static void main(String[] args) {
		System.out.println(fibonacci(3));
	}
	public static int fibonacci (int n){ // n - mitmendat numbrit ma selles jadas leida tahan, numbrite lugemine algab nullist
		if (n==0){   // kohal null (alustan jada lugemist nullist)
			return 0;
		} else if (n==1){  // kohal üks (alustan jada lugemist nullist)
			return 1;
		} else 
		return fibonacci(n-1) + fibonacci(n-2);
	}

}

// siia tuleb veel lisada for tsükkel
