package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String ogrenci1 = "Ahmet";
		String ogrenci2 = "Engin";
		String ogrenci3 = "Murat";
		String ogrenci4 = "Deniz";

		String[] ogrenciler = new String[3];
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Ahmet";
		ogrenciler[2] = "Murat";

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);

		}
		for (String ogrenci : ogrenciler) {
			System.out.println("***");
			System.out.println(ogrenci);
		}

	}

}
