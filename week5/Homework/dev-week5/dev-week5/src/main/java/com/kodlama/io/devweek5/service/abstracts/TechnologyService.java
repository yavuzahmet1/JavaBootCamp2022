package com.kodlama.io.devweek5.service.abstracts;

import com.kodlama.io.devweek5.entity.Technology;
import com.kodlama.io.devweek5.service.request.technologyRequest.CreateTecnologyRequest;
import com.kodlama.io.devweek5.service.request.technologyRequest.UpdateTechnologyRequest;
import com.kodlama.io.devweek5.service.response.technologyResponse.TecnologyListResponse;
import com.kodlama.io.devweek5.service.response.technologyResponse.TecnologyResponse;

import java.util.List;

public interface TechnologyService {
    CreateTecnologyRequest add(CreateTecnologyRequest createTeknologyRequest) throws Exception;
    TecnologyResponse getById(int id) throws Exception;
    String delete(int id) throws Exception;
    TecnologyResponse update(int id, UpdateTechnologyRequest updateTeknologyRequest) throws Exception;
    List<TecnologyListResponse> getAll() throws Exception;
    Technology TeknologyById(int id);

}
