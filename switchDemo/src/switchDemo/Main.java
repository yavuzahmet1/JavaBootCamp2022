package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'C';

		switch (grade) {
		case 'A':
			System.out.println("M�kemmel : Ge�tiniz");
			break;
		case 'B':
			System.out.println("�ok g�zel : Ge�tiniz");
			break;
		case 'C':
			System.out.println("Fena de�il : Ge�tiniz");
			break;
		case 'D':
			System.out.println("Maalesef : Kald�n�z");
			break;
		default:
			System.out.println("Ge�ersiz not ald�n�z");
		}

	}
}
