package kodlamaIoSimulation.business.concretes;

import kodlamaIoSimulation.dataAccess.abstracts.CategoryDao;
import kodlamaIoSimulation.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao_;

	public CategoryManager(CategoryDao categoryDao) {

		categoryDao_ = categoryDao;
	}

	public void add(Category category) throws Exception {
		if (category.getName() == "a") {
			throw new Exception("a olmaz");
		}
		categoryDao_.add(category);

	}

}
