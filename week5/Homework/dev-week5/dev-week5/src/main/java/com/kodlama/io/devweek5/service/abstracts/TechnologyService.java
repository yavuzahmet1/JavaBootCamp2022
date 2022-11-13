package com.kodlama.io.devweek5.service.abstracts;

import java.util.List;

public interface TechnologyService {
    CreateTeknologyRequest add(CreateTeknologyRequest createTeknologyRequest) throws Exception;
    TeknologyResponse getById(int id) throws Exception;
    String delete(int id) throws Exception;
    TeknologyResponse update(int id, UpdateTeknologyRequest updateTeknologyRequest) throws Exception;
    List<TeknologyListResponse> getAll() throws Exception;
    Teknology TeknologyById(int id);

}
