package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;

@RestController
@RequestMapping("/api/brands") // adresleme
@AllArgsConstructor
public class BrandsController {
	private BrandService brandService;

	//@Autowired // git parametrelerine bak kim bu paramaetreleri implemet ediyorsa onu new'le
	/*
	 * public BrandsController(BrandService brandService_) { brandService =
	 * brandService; }
	 */

/*	public BrandsController(BrandService brandService) {
		//super();
		this.brandService = brandService;
	}*/

	@GetMapping("/getall")
	public List<GetAllBrandsResponse> getAll() {
		return this.brandService.getAll();
	}

	@PostMapping("/add")
	public void add(CreateBrandRequest createBrandRequest) {

		this.brandService.add(createBrandRequest);
	}

}
