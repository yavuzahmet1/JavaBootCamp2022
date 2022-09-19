package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava cok güzel";
		System.out.println(mesaj);

		/*
		 * System.out.println(mesaj); System.out.println("Eleman sayýsý : " +
		 * mesaj.length()); System.out.println("5. eleman : " + mesaj.charAt(4));
		 * System.out.println(mesaj.concat(" .Yaþasýn"));// birþeltirme
		 * System.out.println(mesaj); System.out.println(mesaj.startsWith("b"));// A ile
		 * baþlýyorsa true veya false döndürür.java case sensitive // olduðundan büyük
		 * küçük fark eder System.out.println(mesaj.endsWith("."));// bitiþi nasýlsa
		 * true veya false döndürür char[] karakterler = new char[5]; mesaj.getChars(0,
		 * 5, karakterler, 0); System.out.println(karakterler);
		 * System.out.println(mesaj.indexOf("ava"));
		 * System.out.println(mesaj.lastIndexOf("a"));
		 */

		System.out.println(mesaj.replace(' ', '-'));
		System.out.println(mesaj.replace('ü', 'u'));
		System.out.println(mesaj.substring(6));// metni parçalar
		System.out.println(mesaj.substring(6, 8));// isteðimiz aralýðý da parçalayabiliriz.
		System.out.println(mesaj.split(mesaj));

		for (String kelime : mesaj.split(" ")) {// istediðimiz karaktere göre alabiliriz çok kullanýlýr.
			System.out.println(kelime);
		}
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());// baþýndaki ve sonundaki boþluklarý alýr.
	}

}
