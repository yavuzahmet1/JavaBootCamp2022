package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bug�n hava cok g�zel";

		System.out.println(mesaj);
		System.out.println("Eleman say�s� : " + mesaj.length());
		System.out.println("5. eleman : " + mesaj.charAt(4));
		System.out.println(mesaj.concat(" .Ya�as�n"));// bir�eltirme
		System.out.println(mesaj);
		System.out.println(mesaj.startsWith("b"));// A ile ba�l�yorsa true veya false d�nd�r�r.java case sensitive
													// oldu�undan b�y�k k���k fark eder
		System.out.println(mesaj.endsWith("."));// biti�i nas�lsa true veya false d�nd�r�r
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("ava"));
		System.out.println(mesaj.lastIndexOf("a"));

	}

}
