package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.DatabaseLogger;
import oopWithNLayeredApp.core.FileLogger;
import oopWithNLayeredApp.core.Logger;
import oopWithNLayeredApp.core.MailLogger;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1, "IPhonde XR", 10000);
		Product product2 = new Product(2, "IPhonde SE 2020", 1500);
		Product product3 = new Product(3, "IPhonde 14 Pro", 48000);
		Product product4 = new Product(4, "IPhonde 12", 18000);
		Product product5 = new Product(5, "IPhonde 11", 17000);

		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };

		ProductManager productManager = new ProductManager(new JdbcProductDao(), loggers);
		productManager.add(product1);
		productManager.add(product2);
		productManager.add(product3);
		productManager.add(product4);
		productManager.add(product5);

	}

}
