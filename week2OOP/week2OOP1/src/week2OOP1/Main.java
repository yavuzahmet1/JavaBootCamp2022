package week2OOP1;

public class Main {

	public static void main(String[] args) {
		// OOP-Object Oriented Program
		String message = "Vade oraný";
		Product product1 = new Product();
		// set value
		product1.setName = "Delonghi";
		product1.setUnitPrice = 7500;
		product1.setDiscount = 7;
		product1.setUnitInStock = 100;
		product1.setImageUrl = "Bilmemne.jpg";
		product1.setName("Delonghi");

		Product product2 = new Product();
		product2.setName = "Smeg";
		product2.setUnitPrice = 6000;
		product2.setDiscount = 10;
		product2.setUnitInStock = 20;
		product2.setImageUrl = "Bilmemne.jpg";

		Product product3 = new Product();
		product3.setName = "Arçelik";
		product3.setUnitPrice = 4000;
		product3.setDiscount = 12;
		product3.setUnitInStock = 8;
		product3.setImageUrl = "Bilmemne.jpg";

		Product[] products = { product1, product2, product3 };
		System.out.println("<ul>");
		for (Product p : products) {
			System.out.println("<li>" + p.getName + "</li>");// get value
		}
		System.out.println("</ul>");

	}

}
