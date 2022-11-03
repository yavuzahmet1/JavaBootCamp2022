package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.entities.concretes.Brand;

@RestController
@RequestMapping("/api/brands") // adresleme
public class BrandsController {
	private BrandService brandService;

	@Autowired // git parametrelerine bak kim bu paramaetreleri implemet ediyorsa onu new'le
	public BrandsController(BrandService brandService_) {
		this.brandService = brandService;
	}

	@GetMapping("/getAll")
	public List<GetAllBrandsResponse> getAll() {
		return brandService.getAll();
	}
	@PostMapping("/add")
	public void add(CreateBrandRequest createBrandRequest){
		this.brandService.add(createBrandRequest);
	}
}
