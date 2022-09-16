package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		String[][] sehirler = new String[3][3];
		sehirler[0][0] = "Ýstanbul";
		sehirler[0][1] = "Bursa";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Bursa";

		for (int i = 0; i < 2; i++) {
			System.out.println("****");
			for (int j = 0; j < 2; j++) {

				System.out.println(sehirler[i][j]);
			}
		}

	}

}
