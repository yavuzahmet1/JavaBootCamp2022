package kodlama.io.rentACar.business.rules;

import kodlama.io.rentACar.core.exceptions.BusinessException;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service//IOC'ye yerleşsin diye Service anatasyonunu ekledim
@AllArgsConstructor
public class BrandBusinessRules {

    private BrandRepository brandRepository;

    public void checkIfBrandNameExists(String name) {

        if (this.brandRepository.existsByName(name)) {
            throw new BusinessException("Brand Already exists");//çalışma zamanı hatası//java excepton types
        }

    }

}
