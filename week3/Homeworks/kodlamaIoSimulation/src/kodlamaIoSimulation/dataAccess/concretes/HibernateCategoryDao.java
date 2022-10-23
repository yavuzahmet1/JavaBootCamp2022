package kodlamaIoSimulation.dataAccess.concretes;

import kodlamaIoSimulation.dataAccess.abstracts.CategoryDao;
import kodlamaIoSimulation.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println(category.getName() + " Hibernate veritabanýna eklendi");

	}

}
