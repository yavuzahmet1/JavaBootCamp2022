package kodlama.io.rentACar.business.abstracts;

import kodlama.io.rentACar.dto.requests.CreateBrandRequest;
import kodlama.io.rentACar.dto.requests.UpdateBrandRequest;
import kodlama.io.rentACar.dto.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.dto.responses.GetAllModelsResponse;
import kodlama.io.rentACar.dto.responses.GetByIdBrandResponse;
import kodlama.io.rentACar.entities.concretes.Model;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ModelService  {
    List<GetAllModelsResponse> getAll(); // yanıtımız yani Response edilecek
    // yani ModelService'den itibaren veritabanı nesnesi kullanmak yasak

}
