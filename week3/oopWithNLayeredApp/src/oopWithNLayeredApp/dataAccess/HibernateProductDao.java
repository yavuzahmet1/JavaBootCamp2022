package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {
	@Override
	public void add(Product product) {
		// sadece ve sade db eri�im kodlar� buraya yaz�l�r...SQL
		System.out.println(product.getName() + " : Hibernate ile veri taban�na eklendi");
	}

}
