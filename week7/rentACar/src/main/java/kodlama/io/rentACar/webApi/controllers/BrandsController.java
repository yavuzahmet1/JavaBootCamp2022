package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import kodlama.io.rentACar.dto.requests.UpdateBrandRequest;
import kodlama.io.rentACar.dto.responses.GetByIdBrandResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.dto.requests.CreateBrandRequest;
import kodlama.io.rentACar.dto.responses.GetAllBrandsResponse;

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

    @GetMapping
    public List<GetAllBrandsResponse> getAll() {
        return this.brandService.getAll();
    }

    @GetMapping("/{id}")
    public GetByIdBrandResponse getById(@PathVariable int id) {
        return this.brandService.getById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody CreateBrandRequest createBrandRequest) {

        brandService.add(createBrandRequest);

    }

    @PutMapping
    public void update(@RequestBody UpdateBrandRequest updateBrandRequest) {
        this.brandService.update(updateBrandRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        this.brandService.delete(id);
    }

}
