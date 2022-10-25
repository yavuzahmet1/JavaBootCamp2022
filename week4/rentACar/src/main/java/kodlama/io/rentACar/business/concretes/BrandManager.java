package kodlama.io.rentACar.business.concretes;

import java.util.List;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

public class BrandManager implements BrandService {
	private BrandRepository brandRepository_;

	public BrandManager(BrandRepository brandRepository) {
		brandRepository_ = brandRepository;
	}

	@Override
	public List<Brand> getAll() {
		// İş kuralları

		return brandRepository_.getAll();
	}

}
