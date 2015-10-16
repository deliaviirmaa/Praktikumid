package praktikum4;

public class printidaIks {
	public static void main(String[] args) {
		int tabeliSuurus = 7;
		for (int i=0; i<tabeliSuurus*2+3;i++){
			System.out.print("-");
		}
		System.out.println();
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
		for (int i=0; i<tabeliSuurus*2+3;i++){
			System.out.print("-");
		}
	}
}
