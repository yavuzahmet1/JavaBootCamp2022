package com.kodlama.io.devweek5.service.concretes;

import java.util.*;

import com.kodlama.io.devweek5.entity.Technology;
import com.kodlama.io.devweek5.repository.abstracts.TechnologyRepository;
import com.kodlama.io.devweek5.service.abstracts.SoftwareLanguageService;
import com.kodlama.io.devweek5.service.abstracts.TechnologyService;
import com.kodlama.io.devweek5.service.request.technologyRequest.CreateTecnologyRequest;
import com.kodlama.io.devweek5.service.request.technologyRequest.UpdateTechnologyRequest;
import com.kodlama.io.devweek5.service.response.softwareLanguageResponse.SoftwareLanguageResponse;
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
    public CreateTecnologyRequest add(CreateTecnologyRequest createTechnologyRequest) throws Exception {
        Technology technology=new Technology();
        technology.setTechnologyId((int) Math.random());
        technology.setTechnologyName(createTechnologyRequest.getName());
        this.technologyRepository.save(technology);

        return createTechnologyRequest;
    }

    @Override
    public TecnologyResponse getById(int id) throws Exception {
        Optional<Technology> technology=this.technologyRepository.findById(id);
        TecnologyResponse tecnologyResponse=new TecnologyResponse();
        tecnologyResponse.setName(technology.get().getTechnologyName());
        return tecnologyResponse;
    }

    @Override
    public String delete(int id) throws Exception {
        this.technologyRepository.deleteById(id);
        return "Technology deleted!!!";
    }

    @Override
    public TecnologyResponse update(int id, UpdateTechnologyRequest updateTeknologyRequest) throws Exception {
        Optional<Technology>technology=this.technologyRepository.findById(id);
        TecnologyResponse tecnologyResponse=new TecnologyResponse();
        tecnologyResponse.setName(updateTeknologyRequest.getName());
        technology.get().setTechnologyName(updateTeknologyRequest.getName());
        this.technologyRepository.save(technology.get());
        return tecnologyResponse;
    }

    @Override
    public List<TecnologyListResponse> getAll() throws Exception {
        List<Technology> technologyList=this.technologyRepository.findAll();
        List<TecnologyListResponse> tecnologyListResponses=new ArrayList<>();

        SoftwareLanguageResponse softwareLanguageResponse=new SoftwareLanguageResponse();
        for (Technology technology:technologyList){
            TecnologyListResponse tecnologyListResponse=new TecnologyListResponse();

            tecnologyListResponse.setId(technology.getTechnologyId());
            tecnologyListResponse.setName(technology.getTechnologyName());
            tecnologyListResponses.add(tecnologyListResponse);
        }
        return tecnologyListResponses;
    }

    @Override
    public Technology TeknologyById(int id) {
        Optional<Technology> technology=this.technologyRepository.findById(id);

        return technology.get();
    }
}
