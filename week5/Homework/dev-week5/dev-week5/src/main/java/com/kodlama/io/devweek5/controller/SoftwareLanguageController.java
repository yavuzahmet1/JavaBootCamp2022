package com.kodlama.io.devweek5.controller;

import com.kodlama.io.devweek5.service.abstracts.SoftwareLanguageService;
import com.kodlama.io.devweek5.service.request.softwareLanguageRequest.CreateSoftwareLanguageRequest;
import com.kodlama.io.devweek5.service.request.softwareLanguageRequest.UpdateSoftwareLanguageRequest;
import com.kodlama.io.devweek5.service.response.softwareLanguageResponse.SoftwareLanguageListResponse;
import com.kodlama.io.devweek5.service.response.softwareLanguageResponse.SoftwareLanguageResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class SoftwareLanguageController {
    private SoftwareLanguageService softwareLanguageService;

    public SoftwareLanguageController(SoftwareLanguageService softwareLanguageService) {
        this.softwareLanguageService = softwareLanguageService;
    }

    @PostMapping("/add")
    CreateSoftwareLanguageRequest add(@RequestBody CreateSoftwareLanguageRequest createSoftwareLanguageRequest) throws Exception {
        return this.softwareLanguageService.add(createSoftwareLanguageRequest);
    }

    @GetMapping("/getById")
    SoftwareLanguageResponse getById(@RequestParam int id) throws Exception {
        return this.softwareLanguageService.getById(id);
    }

    @DeleteMapping("/delete")
    String delete(@RequestParam int id) throws Exception {
        return this.softwareLanguageService.delete(id);
    }

    @PutMapping("/update")
    SoftwareLanguageResponse update(@RequestParam int id, @RequestBody UpdateSoftwareLanguageRequest updateSoftwareLanguageRequest) throws Exception {
        return this.softwareLanguageService.update(id, updateSoftwareLanguageRequest);
    }

    @GetMapping("/getall")
    List<SoftwareLanguageListResponse> getAll()throws Exception{
        return this.softwareLanguageService.getAll();
    }


}
