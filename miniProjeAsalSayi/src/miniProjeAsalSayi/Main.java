package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = 1;

		boolean isPrime = true;
		if (number == 1) {
			System.out.println("say� asal de�ildir.");
			return;

		}
		if (number < 1) {
			System.out.println("Ge�ersiz say�");
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println("say� asald�r : " + number);
		} else {
			System.out.println("say� asal de�ildir : " + number);
		}

	}

}
