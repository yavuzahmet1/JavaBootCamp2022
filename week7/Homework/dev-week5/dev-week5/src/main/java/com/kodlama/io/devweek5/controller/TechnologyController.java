package com.kodlama.io.devweek5.controller;

import com.kodlama.io.devweek5.service.abstracts.TechnologyService;

import com.kodlama.io.devweek5.service.request.technologyRequest.CreateTecnologyRequest;
import com.kodlama.io.devweek5.service.request.technologyRequest.UpdateTechnologyRequest;
import com.kodlama.io.devweek5.service.response.technologyResponse.TecnologyListResponse;
import com.kodlama.io.devweek5.service.response.technologyResponse.TecnologyResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/technologies")
public class TechnologyController {
    private TechnologyService technologyService;

    public TechnologyController(TechnologyService technologyService) {
        this.technologyService = technologyService;
    }

    @PostMapping("/add")
    CreateTecnologyRequest add(@RequestBody CreateTecnologyRequest createTecnologyRequest) throws Exception {
        return this.technologyService.add(createTecnologyRequest);
    }

    @GetMapping("getbyid")
    TecnologyResponse getById(@RequestParam int id) throws Exception {
        return this.technologyService.getById(id);
    }

    @DeleteMapping("/delete")
    String delete(int id) throws Exception {
        return this.technologyService.delete(id);
    }

    @PutMapping("/update")
    TecnologyResponse update(@RequestParam int id, @RequestBody UpdateTechnologyRequest updateTechnologyRequest) throws Exception {
        return this.technologyService.update(id, updateTechnologyRequest);
    }

    @GetMapping("/getall")
    List<TecnologyListResponse> getAll()throws Exception{
        return this.technologyService.getAll();
    }


}
