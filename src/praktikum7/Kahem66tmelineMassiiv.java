package praktikum7;

//Kirjutada meetod, mis leiab ja tagastab ettantud kahemõõtmelise massiivi maksimaalse elemendi. 
//Kirjuta kõigepealt meetod, mis leiab ühemõõtmelise massiivi maksimaalse elemendi ning kasuta siis seda 
//meetodit teises: meetod, mis leiab ühemõõtmelise massiivi maksimumi
//	public static int maksimum(int[] massiiv)
//	// meetod, mis leiab maatriksi maksimumi
//	publiv static int maksimum(int[][] maatriks) {
//	   // maatriksi rea maksimumi leidmiseks saad siin edukalt kasutada eelmist meetodit
//	}

public class Kahem66tmelineMassiiv {

	
		public static void main(String[] args) {
			int [][] m = {{1, 7, 2},{9 ,3, 2}};
			
			System.out.println(suurim(m));

		}
		public static int suurim(int [][] m)
		{
			int suurim = 0;
			for (int i = m.length;i!=0;i--)
			{
				for (int a = m.length;a!=0;a--)
				{
					if (m[i-1][a-1]> suurim)
					{
						suurim = m [i-1][a-1];
					}
				}
			}
			
			return suurim;
		}
		
		
	}
	

