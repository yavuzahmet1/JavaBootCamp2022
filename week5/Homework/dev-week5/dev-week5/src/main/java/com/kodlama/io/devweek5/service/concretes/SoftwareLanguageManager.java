package com.kodlama.io.devweek5.service.concretes;

import com.kodlama.io.devweek5.entity.SoftwareLanguage;
import com.kodlama.io.devweek5.repository.abstracts.SoftwareLanguageRepository;
import com.kodlama.io.devweek5.service.abstracts.SoftwareLanguageService;
import com.kodlama.io.devweek5.service.request.softwareLanguageRequest.AddSoftwareLanguageRequest;
import com.kodlama.io.devweek5.service.request.softwareLanguageRequest.DeleteSoftwareLanguageRequest;
import com.kodlama.io.devweek5.service.request.softwareLanguageRequest.UpdateSoftwareLanguageRequest;
import com.kodlama.io.devweek5.service.response.softwareLanguageResponse.GetAllSoftwareLanguageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SoftwareLanguageManager implements SoftwareLanguageService {
    @Autowired
    private SoftwareLanguageRepository softwareLanguageRepository;
    private SoftwareLanguage softwareLanguage;

    @Override
    public List<GetAllSoftwareLanguageResponse> getAll() {
        List<SoftwareLanguage> softwareLanguages = softwareLanguageRepository.findAll();
        List<GetAllSoftwareLanguageResponse> softwareLanguageResponses = new ArrayList<GetAllSoftwareLanguageResponse>();
        for (SoftwareLanguage softwareLanguage : softwareLanguages) {
            GetAllSoftwareLanguageResponse responseSoft = new GetAllSoftwareLanguageResponse();
            responseSoft.setId(softwareLanguage.getId());
            responseSoft.setSoftName(softwareLanguage.getSoftwareLanguageName());
            softwareLanguageResponses.add(responseSoft);
        }
        return softwareLanguageResponses;
    }

    @Override
    public void add(AddSoftwareLanguageRequest addSoftwareLanguageRequest) {
        softwareLanguage.setSoftwareLanguageName(addSoftwareLanguageRequest.getSoftName());
        softwareLanguageRepository.save(softwareLanguage);

    }

    @Override
    public void delete(DeleteSoftwareLanguageRequest deleteSoftwareLanguageRequest) throws Exception {
        if (isIdExist(deleteSoftwareLanguageRequest.getId())) {
            throw new Exception("Id is not delete because it not exist!!!");
        }
        softwareLanguage.setId(deleteSoftwareLanguageRequest.getId());
        softwareLanguageRepository.delete(softwareLanguage);

    }

    @Override
    public void update(UpdateSoftwareLanguageRequest updateSoftwareLanguageRequest) throws Exception {
        if (isNameExist(updateSoftwareLanguageRequest.getSoftName()) || !isIdExist(updateSoftwareLanguageRequest.getId())) {
            throw new Exception("There is a lack of Id or Name information. Please check");
        }
    }
    public boolean isIdExist(int id) {
        for (SoftwareLanguage listId : softwareLanguageRepository.findAll()) {
            if (listId.getId() == id) {
                return true;
            }
        }
        return false;
    }
    public boolean isNameExist(String name) {
        for (SoftwareLanguage listName : softwareLanguageRepository.findAll()) {
            if (listName.getSoftwareLanguageName().toLowerCase().equals(name.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

}
