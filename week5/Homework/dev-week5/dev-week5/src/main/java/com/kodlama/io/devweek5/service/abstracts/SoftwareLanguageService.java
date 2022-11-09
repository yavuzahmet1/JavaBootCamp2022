package com.kodlama.io.devweek5.service.abstracts;

import com.kodlama.io.devweek5.service.request.softwareLanguageRequest.AddSoftwareLanguageRequest;
import com.kodlama.io.devweek5.service.request.softwareLanguageRequest.DeleteSoftwareLanguageRequest;
import com.kodlama.io.devweek5.service.request.softwareLanguageRequest.UpdateSoftwareLanguageRequest;
import com.kodlama.io.devweek5.service.response.softwareLanguageResponse.GetAllSoftwareLanguageResponse;

import java.util.List;

public interface SoftwareLanguageService {
    List<GetAllSoftwareLanguageResponse> getAll();
    void add(AddSoftwareLanguageRequest addSoftwareLanguageRequest);
    void delete(DeleteSoftwareLanguageRequest deleteSoftwareLanguageRequest) throws Exception;
    void update(UpdateSoftwareLanguageRequest updateSoftwareLanguageRequest) throws Exception;
}
