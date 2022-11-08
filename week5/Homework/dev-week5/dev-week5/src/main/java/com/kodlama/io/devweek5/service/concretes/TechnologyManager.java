package com.kodlama.io.devweek5.service.concretes;

import java.util.*;
import com.kodlama.io.devweek5.entity.Technology;
import com.kodlama.io.devweek5.repository.abstracts.TechnologyRepository;
import com.kodlama.io.devweek5.service.abstracts.TechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TechnologyManager implements TechnologyService {
    @Autowired
    private TechnologyRepository technologyRepository;
    @Override
    public List<Technology> getAll() {
        return technologyRepository.findAll();
    }

    @Override
    public void add(Technology technology) {

    }
}
