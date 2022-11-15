package com.kodlama.io.devweek5.service.concretes;

import com.kodlama.io.devweek5.entity.SoftwareLanguage;
import com.kodlama.io.devweek5.entity.Technology;
import com.kodlama.io.devweek5.repository.abstracts.SoftwareLanguageRepository;
import com.kodlama.io.devweek5.service.abstracts.SoftwareLanguageService;
import com.kodlama.io.devweek5.service.abstracts.TechnologyService;
import com.kodlama.io.devweek5.service.request.softwareLanguageRequest.CreateSoftwareLanguageRequest;
import com.kodlama.io.devweek5.service.request.softwareLanguageRequest.UpdateSoftwareLanguageRequest;
import com.kodlama.io.devweek5.service.response.softwareLanguageResponse.SoftwareLanguageListResponse;
import com.kodlama.io.devweek5.service.response.softwareLanguageResponse.SoftwareLanguageResponse;
import com.kodlama.io.devweek5.service.response.technologyResponse.TecnologyListResponse;
import com.kodlama.io.devweek5.service.response.technologyResponse.TecnologyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SoftwareLanguageManager implements SoftwareLanguageService {
    private SoftwareLanguageRepository softwareLanguageRepository;
    private TechnologyService technologyService;


    @Autowired
    public SoftwareLanguageManager(SoftwareLanguageRepository softwareLanguageRepository, TechnologyService technologyService) {
        this.softwareLanguageRepository = softwareLanguageRepository;
        this.technologyService = technologyService;
    }


    @Override
    public CreateSoftwareLanguageRequest add(CreateSoftwareLanguageRequest createSoftwareLanguageRequest) throws Exception {
        isEmptyName(createSoftwareLanguageRequest.getName());
        isExistName(createSoftwareLanguageRequest.getName());
        List<TecnologyResponse> technologies = new ArrayList<>();

        for (Integer id : createSoftwareLanguageRequest.getTechnologyIds()) {
            TecnologyResponse technologyById = technologyService.getById(id);
            technologies.add(technologyById);
        }
        SoftwareLanguage softwareLanguage = new SoftwareLanguage();
        softwareLanguage.setId((int) Math.random());
        softwareLanguage.setName(createSoftwareLanguageRequest.getName());
        this.softwareLanguageRepository.save(softwareLanguage);
        return createSoftwareLanguageRequest;

    }

    @Override
    public SoftwareLanguageResponse getById(int id) throws Exception {
        isValidId(id);
        isNotExist(id);
        Optional<SoftwareLanguage> softwareLanguage = this.softwareLanguageRepository.findById(id);
        SoftwareLanguageResponse softwareLanguageResponse = new SoftwareLanguageResponse();
        softwareLanguageResponse.setName(softwareLanguage.get().getName());
        return softwareLanguageResponse;
    }

    @Override
    public String delete(int id) throws Exception {
        isNotExist(id);
        isValidId(id);
        this.softwareLanguageRepository.deleteById(id);

        return "Successful is delete";
    }

    @Override
    public SoftwareLanguageResponse update(int id, UpdateSoftwareLanguageRequest updateSoftwareLanguageRequest) throws Exception {
        isNotExist(id);
        isExistName(updateSoftwareLanguageRequest.getName());
        isEmptyName(updateSoftwareLanguageRequest.getName());
        isValidId(id);

        Optional<SoftwareLanguage> softwareLanguage = this.softwareLanguageRepository.findById(id);

        return null;
    }

    @Override
    public List<SoftwareLanguageListResponse> getAll() throws Exception {
        List<SoftwareLanguage> softwareLanguageList = this.softwareLanguageRepository.findAll();
        List<SoftwareLanguageListResponse> softwareLanguageListResponseList = new ArrayList<>();
        List<TecnologyListResponse> tecnologyListResponseList = new ArrayList<>();

        for (SoftwareLanguage softList : softwareLanguageList) {
            SoftwareLanguageListResponse softwareLanguageListResponse = new SoftwareLanguageListResponse();
            softwareLanguageListResponse.setId(softList.getId());
            softwareLanguageListResponse.setName(softList.getName());
            softwareLanguageListResponseList.add(softwareLanguageListResponse);

            for (Technology tech : softList.getTechnologies()) {
                TecnologyListResponse tecnologyListResponse = new TecnologyListResponse();
                TecnologyResponse technologyById = this.technologyService.getById(tech.getTechnologyId());
                tecnologyListResponse.setId(tecnologyListResponse.getId());
                tecnologyListResponse.setName(tecnologyListResponse.getName());
                tecnologyListResponseList.add(tecnologyListResponse);

            }
            softwareLanguageListResponse.setTecnologyListResponses(tecnologyListResponseList);
        }

        return softwareLanguageListResponseList;
    }

    @Override
    public SoftwareLanguage getSoftwareLanguageById(int id) {
        Optional<SoftwareLanguage> softwareLanguage = this.softwareLanguageRepository.findById(id);
        return softwareLanguage.get();
    }

    private void isValidId(int id) throws Exception {
        if (id <= 0) {
            throw new Exception("Id is not valid.");
        }
    }

    private void isNotExist(int id) throws Exception {
        List<SoftwareLanguage> softwareLanguages = this.softwareLanguageRepository.findAll();
        for (SoftwareLanguage language : softwareLanguages) {
            if (language.getId() != id) {
                throw new Exception(" There is not exist id : " + id);
            }
        }
    }

    private void isEmptyName(String name) throws Exception {
        if (name == null || name == "") {
            throw new Exception("Name is not null!!");
        }
    }

    private void isExistName(String name) throws Exception {
        List<SoftwareLanguage> language = this.softwareLanguageRepository.findAll();
        for (SoftwareLanguage languages : language) {
            if (languages.getName().equalsIgnoreCase(name)) {
                throw new Exception("Name is already exist : " + name);
            }
        }
    }
}
//Optional<?> nedir?
//Amacı null pointer exeptionları en aza indirmek ve null kontrolü yapılmasına gerek kalmaz.
//yazılım ve okunabilirlik artar.