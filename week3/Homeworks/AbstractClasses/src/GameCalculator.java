
public abstract class GameCalculator {
	// �u operasyonun hi�birinin defaultu olmas�n
	// abstarct classda illa abstract olmak zorunda de�il
	// di�er g�zel yan� da base s�n�f�da gizler
	// abstracts s�n�flar asla new'lenemezler.
	// abstract s�n�flar tek ba��na kullan�lmazlar

	public abstract void hesapla();// kim extends ediyorsa kendi hesaplas�n� yazmak zorunda

	public final void gameOver() {// game Calcurator'u kim kullan�yorsa game overi oldu�u gibi kullanmak zorunda
		System.out.println("Oyun bitti");
	}

}
