package week2OOPHomework;

public class Main {

	public static void main(String[] args) {
		mesajVer("Ahmet");
		hesapla();
		System.out.println(topla(3, 7));
		System.out.println(toplaIkiSayininYuzdeOnu(6, 9));
		System.out.println(krediHesapla(123));

	}

	public static void mesajVer(String message) {
		System.out.println("Merhaba : " + message);
	}

	public static void hesapla() {
		System.out.println("Hesaplandý");
	}

	public static int topla(int sayi1, int sayi2) {
		int toplam = sayi1 + sayi2;
		return toplam;
	}

	public static double toplaIkiSayininYuzdeOnu(int sayi1, int sayi2) {
		int toplam = topla(sayi1, sayi2);
		double sonuc = toplam * 10 / 100;
		return sonuc;
	}

	public static double krediHesapla(double krediMiktari) {
		return krediMiktari;
	}

}
