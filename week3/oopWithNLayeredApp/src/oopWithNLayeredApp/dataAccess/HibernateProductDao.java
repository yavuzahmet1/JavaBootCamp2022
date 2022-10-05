package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {
	@Override
	public void add(Product product) {
		// sadece ve sade db eriþim kodlarý buraya yazýlýr...SQL
		System.out.println(product.getName() + " : Hibernate ile veri tabanýna eklendi");
	}

}
