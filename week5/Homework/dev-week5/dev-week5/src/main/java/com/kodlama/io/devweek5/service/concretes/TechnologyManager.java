package com.kodlama.io.devweek5.service.concretes;

import java.util.*;

import com.kodlama.io.devweek5.entity.Technology;
import com.kodlama.io.devweek5.repository.abstracts.TechnologyRepository;
import com.kodlama.io.devweek5.service.abstracts.SoftwareLanguageService;
import com.kodlama.io.devweek5.service.abstracts.TechnologyService;
import com.kodlama.io.devweek5.service.request.technologyRequest.CreateTecnologyRequest;
import com.kodlama.io.devweek5.service.request.technologyRequest.UpdateTechnologyRequest;
import com.kodlama.io.devweek5.service.response.technologyResponse.TecnologyListResponse;
import com.kodlama.io.devweek5.service.response.technologyResponse.TecnologyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class TechnologyManager implements TechnologyService {
    private TechnologyRepository technologyRepository;
   @Lazy
   private SoftwareLanguageService softwareLanguageService;

    @Autowired
    public TechnologyManager(TechnologyRepository technologyRepository, @Lazy SoftwareLanguageService softwareLanguageService) {
        this.technologyRepository = technologyRepository;
        this.softwareLanguageService=softwareLanguageService;
    }

    @Override
    public CreateTecnologyRequest add(CreateTecnologyRequest createTeknologyRequest) throws Exception {
        return null;
    }

    @Override
    public TecnologyResponse getById(int id) throws Exception {
        return null;
    }

    @Override
    public String delete(int id) throws Exception {
        return null;
    }

    @Override
    public TecnologyResponse update(int id, UpdateTechnologyRequest updateTeknologyRequest) throws Exception {
        return null;
    }

    @Override
    public List<TecnologyListResponse> getAll() throws Exception {
        return null;
    }

    @Override
    public Technology TeknologyById(int id) {
        return null;
    }
}
