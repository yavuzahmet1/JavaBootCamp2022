package com.kodlama.io.devweek5.service.concretes;

import com.kodlama.io.devweek5.entity.SoftwareLanguage;
import com.kodlama.io.devweek5.repository.abstracts.SoftwareLanguageRepository;
import com.kodlama.io.devweek5.service.abstracts.SoftwareLanguageService;
import com.kodlama.io.devweek5.service.abstracts.TechnologyService;
import com.kodlama.io.devweek5.service.request.softwareLanguageRequest.UpdateSoftwareLanguageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftwareLanguageManager implements SoftwareLanguageService {
    private SoftwareLanguageRepository softwareLanguageRepository;
    private TechnologyService technologyService;


    @Autowired
    public SoftwareLanguageManager(SoftwareLanguageRepository softwareLanguageRepository, TechnologyService technologyService) {
        this.softwareLanguageRepository = softwareLanguageRepository;
        this.technologyService=technologyService;
    }

    @Override
    public CreateSoftwareLanguageRequest add(CreateSoftwareLanguageRequest createSoftwareLanguageRequest) throws Exception {
        return null;
    }

    @Override
    public SoftwareLanguageResponse getById(int id) throws Exception {
        return null;
    }

    @Override
    public String delete(int id) throws Exception {
        return null;
    }

    @Override
    public SoftwareLanguageResponse update(int id, UpdateSoftwareLanguageRequest updateSoftwareLanguageRequest) throws Exception {
        return null;
    }

    @Override
    public List<SoftwareLanguageListResponse> getAll() throws Exception {
        return null;
    }

    @Override
    public SoftwareLanguage getSoftwareLanguageById(int id) {
        return null;
    }
}
