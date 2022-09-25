
public abstract class GameCalculator {
	// þu operasyonun hiçbirinin defaultu olmasýn
	// abstarct classda illa abstract olmak zorunda deðil
	// diðer güzel yaný da base sýnýfýda gizler
	// abstracts sýnýflar asla new'lenemezler.
	// abstract sýnýflar tek baþýna kullanýlmazlar

	public abstract void hesapla();// kim extends ediyorsa kendi hesaplasýný yazmak zorunda

	public final void gameOver() {// game Calcurator'u kim kullanýyorsa game overi olduðu gibi kullanmak zorunda
		System.out.println("Oyun bitti");
	}

}
