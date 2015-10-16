package praktikum4;

public class ekraanileTabel {
	public static void main(String[] args) {
		int tabeliSuurus = 7;
		for (int j = 0; j < tabeliSuurus; j++) {
			for (int i = 0; i < tabeliSuurus; i++) {
				if (i==j)
				System.out.print("1 ");
				else
					System.out.print("0 ");
			}
			// reavahetus
			System.out.println();
		}
	}
}
