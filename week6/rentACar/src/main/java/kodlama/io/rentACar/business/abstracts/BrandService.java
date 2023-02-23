package kodlama.io.rentACar.business.abstracts;

import java.util.List;

import kodlama.io.rentACar.dto.requests.CreateBrandRequest;
import kodlama.io.rentACar.dto.requests.UpdateBrandRequest;
import kodlama.io.rentACar.dto.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.dto.responses.GetByIdBrandResponse;

public interface BrandService {
    List<GetAllBrandsResponse> getAll(); // yanıtımız yani Response edilecek
    // yani BrandService'den itibaren veritabanı nesnesi kullanmak yasak

    GetByIdBrandResponse getById(int id);

    void add(CreateBrandRequest createBrandRequest);

    void update(UpdateBrandRequest updateBrandRequest);

    void delete(int id);


}
