package com.kodlama.io.devweek5.service.abstracts;

import com.kodlama.io.devweek5.entity.SoftwareLanguage;
import com.kodlama.io.devweek5.service.request.softwareLanguageRequest.UpdateSoftwareLanguageRequest;

import java.util.List;

public interface SoftwareLanguageService {
    CreateSoftwareLanguageRequest add(CreateSoftwareLanguageRequest createSoftwareLanguageRequest) throws Exception;
    SoftwareLanguageResponse getById(int id) throws Exception;
    String delete(int id) throws Exception;
    SoftwareLanguageResponse update(int id, UpdateSoftwareLanguageRequest updateSoftwareLanguageRequest) throws Exception;
    List<SoftwareLanguageListResponse> getAll() throws Exception;
    SoftwareLanguage getSoftwareLanguageById(int id);
}
