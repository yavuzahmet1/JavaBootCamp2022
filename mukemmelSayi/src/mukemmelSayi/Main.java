package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		// 6-1,2,3
		int number = 5;
		int total = 0;

		for (int i = 0; i < number; i++) {
			if (number % i == 0) {
				total = total + i;
			}

		}
		if (total == number) {
			System.out.println("M�kemmle say�d�r.");
		} else {
			System.out.println("M�kemmel sayi de�ildir.");
		}

	}

}
