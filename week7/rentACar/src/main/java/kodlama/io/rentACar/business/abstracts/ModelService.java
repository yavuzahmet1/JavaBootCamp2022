package kodlama.io.rentACar.business.abstracts;

import kodlama.io.rentACar.dto.requests.CreateModelRequest;

import kodlama.io.rentACar.dto.responses.GetAllModelsResponse;


import java.util.List;

public interface ModelService {
    List<GetAllModelsResponse> getAll(); // yanıtımız yani Response edilecek

    // yani ModelService'den itibaren veritabanı nesnesi kullanmak yasak
    void add(CreateModelRequest createModelRequest);

}
