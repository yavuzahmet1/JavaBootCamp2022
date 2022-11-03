package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.entities.concretes.Brand;

@RestController
@RequestMapping("/api/brands") // adresleme
public class BrandsController {
	private BrandService brandService_;

	@Autowired // git parametrelerine bak kim bu paramaetreleri implemet ediyorsa onu new'le
	public BrandsController(BrandService brandService_) {
		this.brandService_ = brandService_;
	}

	@GetMapping("/getAll")
	public List<Brand> getAll() {
		return brandService_.getAll();

	}

}
