package com.kodlama.io.devweek5.service.abstracts;

import com.kodlama.io.devweek5.entity.Technology;
import com.kodlama.io.devweek5.service.request.technologyRequest.DeleteTechnologyRequest;

import java.util.List;

public interface TechnologyService {
    List<Technology> getAll();

    void add(Technology technology);

    void delete(DeleteTechnologyRequest deleteTechnologyRequest);
}
