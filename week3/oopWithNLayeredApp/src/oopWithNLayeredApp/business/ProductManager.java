package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.Logger;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;
	// private List<Logger> loggers;böylede olabilir

	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception {// iþ kurallarý
		if (product.getUnitPrice() < 10) {
			throw new Exception("Ürün fiyatý 10'dan küçük olamaz");
		}

		// ProductDao productDao = new HibernateProductDao();
		productDao.add(product);

		for (Logger logger : loggers) {
			logger.log(product.getName());
		}
	}
}
