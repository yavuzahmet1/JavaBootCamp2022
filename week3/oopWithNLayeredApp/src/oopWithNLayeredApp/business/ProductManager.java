package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.Logger;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;
	// private List<Logger> loggers;b�ylede olabilir

	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception {// i� kurallar�
		if (product.getUnitPrice() < 10) {
			throw new Exception("�r�n fiyat� 10'dan k���k olamaz");
		}

		// ProductDao productDao = new HibernateProductDao();
		productDao.add(product);

		for (Logger logger : loggers) {
			logger.log(product.getName());
		}
	}
}
