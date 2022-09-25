package week2OOPHomeworkArrayList;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		/*
		 * Product product = new Product(); product.setName("Computer");
		 * 
		 * Product product1 = new Product(); product1.setName("Mause");
		 * 
		 * Product[] products = new Product[] { product, product1 };
		 * 
		 * for (Product p : products) { System.out.println(p.getName()); }
		 */

		CreditManager creditManager = new CreditManager();
		creditManager.add();
		creditManager.calculate();

		MortgageManager mortgageManager = new MortgageManager();
		mortgageManager.calculate();

		CreditManager[] credits = new CreditManager[3];
		credits[0] = new MortgageManager();
		credits[1] = new VehicleManager();
		credits[2] = new EducateCreditManager();

		for (CreditManager c : credits) {
			System.out.println("***");
			c.calculate();
		}

		/*
		 * ICreditManager[] creditsInterface = new ICreditManager[3];
		 * creditsInterface[0] = new ImpMortgageManager(); creditsInterface[1] = new
		 * ImpVehicleManager(); creditsInterface[2] = new ImpEducateCreditManager();
		 */

		ArrayList<ICreditManager> creditsInterface = new ArrayList<ICreditManager>();
		creditsInterface.add(new ImpMortgageManager());
		creditsInterface.add(new ImpVehicleManager());
		creditsInterface.add(new ImpEducateCreditManager());
		creditsInterface.add(new ImpFarmerCreditManager());

		for (ICreditManager c1 : creditsInterface) {
			System.out.println("***");
			c1.calculate();
		}
	}

}
