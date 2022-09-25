package week2HomeworkArrays;

public class Main {

	public static void main(String[] args) {
		/*
		 * String[] country1 = new String[] { "Ankara", "Istanbul", "Adana", "Izmir" };
		 * 
		 * for (String s : country1) { System.out.println(s); }
		 */

		int[] numbers = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int searching = 45;

		boolean isThere = numberSearch(numbers, searching);

		getMessage(isThere, searching);
	}

	public static void getMessage(boolean isThere, int searching) {
		String message = "";

		if (isThere) {
			message = "There is number : " + searching;
			System.out.println(message);
		} else {
			message = ("There isn't number : " + searching);
			System.out.println(message);
		}
	}

	public static boolean numberSearch(int[] number, int searching) {
		boolean isThere = false;

		for (int num : number) {
			if (num == searching) {
				isThere = true;
				break;
			}
		}
		return isThere;
	}

}
