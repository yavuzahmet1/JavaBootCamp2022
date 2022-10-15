package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.DatabaseLogger;
import oopWithNLayeredApp.core.FileLogger;
import oopWithNLayeredApp.core.Logger;
import oopWithNLayeredApp.core.MailLogger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1, "IPhonde XR", 10);
		Product product2 = new Product(2, "IPhonde SE 2020", 1500);

		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };

		ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
		productManager.add(product1);
		productManager.add(product2);

	}

}
