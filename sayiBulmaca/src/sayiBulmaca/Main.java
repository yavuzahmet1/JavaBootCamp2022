package sayiBulmaca;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0, 19 };
		int aranacak = 10;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}

		if (varMi) {
			System.out.println("Sayi mevcuttur.");
		} else {
			System.out.println("Sayi mevcut deðildir.");
		}

	}

}
