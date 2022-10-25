package kodlama.io.rentACar.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

@Service // bu sınıf bir business nesnesidir.
public class BrandManager implements BrandService {
	private BrandRepository brandRepository_;

	@Autowired
	public BrandManager(BrandRepository brandRepository) {
		brandRepository_ = brandRepository;
	}

	@Override
	public List<Brand> getAll() {
		// İş kuralları

		return brandRepository_.getAll();
	}

}
