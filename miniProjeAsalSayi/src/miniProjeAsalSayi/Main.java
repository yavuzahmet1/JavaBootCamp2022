package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = 1;

		boolean isPrime = true;
		if (number == 1) {
			System.out.println("sayý asal deðildir.");
			return;

		}
		if (number < 1) {
			System.out.println("Geçersiz sayý");
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println("sayý asaldýr : " + number);
		} else {
			System.out.println("sayý asal deðildir : " + number);
		}

	}

}
