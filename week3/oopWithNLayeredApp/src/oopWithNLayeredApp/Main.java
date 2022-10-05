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

		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };

		ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
		productManager.add(product1);

	}

}
