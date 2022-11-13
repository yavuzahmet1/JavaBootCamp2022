package com.kodlama.io.devweek5.service.concretes;

import java.util.*;

import com.kodlama.io.devweek5.repository.abstracts.TechnologyRepository;
import com.kodlama.io.devweek5.service.abstracts.TechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TechnologyManager implements TechnologyService {
    private TechnologyRepository technologyRepository;

    @Autowired
    public TechnologyManager(TechnologyRepository technologyRepository) {
        this.technologyRepository = technologyRepository;
    }

    @Override
    public CreateTeknologyRequest add(CreateTeknologyRequest createTeknologyRequest) throws Exception {
        return null;
    }

    @Override
    public TeknologyResponse getById(int id) throws Exception {
        return null;
    }

    @Override
    public String delete(int id) throws Exception {
        return null;
    }

    @Override
    public TeknologyResponse update(int id, UpdateTeknologyRequest updateTeknologyRequest) throws Exception {
        return null;
    }

    @Override
    public List<TeknologyListResponse> getAll() throws Exception {
        return null;
    }

    @Override
    public Teknology TeknologyById(int id) {
        return null;
    }
}
