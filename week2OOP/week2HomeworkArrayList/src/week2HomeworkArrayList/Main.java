package week2HomeworkArrayList;

public class Main {

	public static void main(String[] args) {
		String[] cities = new String[] { "Adana", "Ankara", "Izmir", "Bursa" };
		String[] cities1 = new String[] { "Antep", "Urfa", "Hatay", "Diyarbakir" };

		cities = cities1;
		cities[0] = "Kahramanmaras";
		System.out.println(cities1[0]);

		/*
		 * for (String s : cities) {
		 * 
		 * System.out.println(s); }
		 * 
		 * cities = new String[4]; cities[3] = "Kocaeli";
		 * 
		 * for (String s : cities) {
		 * 
		 * System.out.println(s); }
		 */

	}

}
