package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {
	@Override
	public void add(Product product) {
		// sadece ve sade db eri�im kodlar� buraya yaz�l�r...SQL
		System.out.println(product.getName() + " : JDBC ile veri taban�na eklendi");
	}

}
