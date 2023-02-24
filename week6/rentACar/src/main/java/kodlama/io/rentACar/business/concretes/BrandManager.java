package kodlama.io.rentACar.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import kodlama.io.rentACar.core.mappers.ModelMapperService;
import kodlama.io.rentACar.dto.requests.UpdateBrandRequest;
import kodlama.io.rentACar.dto.responses.GetByIdBrandResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.dto.requests.CreateBrandRequest;
import kodlama.io.rentACar.dto.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

@Service
@AllArgsConstructor
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;
    private ModelMapperService modelMapperService;

    @Override
    public List<GetAllBrandsResponse> getAll() {

        List<Brand> brands = brandRepository.findAll();

        /*List<GetAllBrandsResponse> brandsResponse = new ArrayList<GetAllBrandsResponse>();

        for (Brand brand : brands) {
            GetAllBrandsResponse responseItem = new GetAllBrandsResponse();
            responseItem.setId(brand.getId());
            responseItem.setName(brand.getName());

            brandsResponse.add(responseItem);
        }*/

        List<GetAllBrandsResponse> brandsResponse = brands.stream()
                .map(brand -> this.modelMapperService.forResponse().map(brand, GetAllBrandsResponse.class))
                .collect(Collectors.toList());

        return brandsResponse;
    }

    @Override
    public GetByIdBrandResponse getById(int id) {

        Brand brand = brandRepository.findById(id).orElseThrow();

        GetByIdBrandResponse response = modelMapperService.forResponse()
                .map(brand, GetByIdBrandResponse.class);

        return response;
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {

        //Brand brand = new Brand();

		//brand.setName(createBrandRequest.getName());
        //brand.setName("deneme");

        Brand brand = modelMapperService.forRequest()
                .map(createBrandRequest, Brand.class);

        brandRepository.save(brand);
    }
    @Override
    public void update(UpdateBrandRequest updateBrandRequest) {
        Brand brand = modelMapperService.forRequest().map(updateBrandRequest, Brand.class);
        brandRepository.save(brand);

    }
    @Override
    public void delete(int id) {
        brandRepository.deleteById(id);

    }

}
