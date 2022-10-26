package kodlama.io.rentACar.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

@Repository
public class InMemoryBrandRepository implements BrandRepository {
	List<Brand> brands;

	public InMemoryBrandRepository() {
		brands = new ArrayList<Brand>();// veritabanımız olmadığından data oluşturuyoruz
		brands.add(new Brand(1, "BMV"));
		brands.add(new Brand(2, "Mercedes"));
		brands.add(new Brand(3, "Audi"));
		brands.add(new Brand(4, "Renault"));
		brands.add(new Brand(5, "Fiat"));
		brands.add(new Brand(6, "TOGG"));
		brands.add(new Brand(7, "Toyota"));
		brands.add(new Brand(8, "Hundai"));
	}

	@Override
	public List<Brand> getAll() {
		// TODO Auto-generated method stub
		return brands;
	}

}
