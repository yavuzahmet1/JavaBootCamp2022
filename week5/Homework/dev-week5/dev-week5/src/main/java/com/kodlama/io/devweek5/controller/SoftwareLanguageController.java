package com.kodlama.io.devweek5.controller;

import com.kodlama.io.devweek5.service.abstracts.SoftwareLanguageService;
import com.kodlama.io.devweek5.service.request.softwareLanguageRequest.AddSoftwareLanguageRequest;
import com.kodlama.io.devweek5.service.request.softwareLanguageRequest.UpdateSoftwareLanguageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class SoftwareLanguageController {
    @Autowired
    private SoftwareLanguageService softwareLanguageService;

    @GetMapping("/getall")
    public List<GetAllSoftwareLanguageResponse> getAll() {

        return softwareLanguageService.getAll();
    }

    @PostMapping("/add")
    public void add(AddSoftwareLanguageRequest addSoftwareLanguageRequest) {
        softwareLanguageService.add(addSoftwareLanguageRequest);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody DeleteSoftwareLanguageRequest deleteSoftwareLanguageRequest) throws Exception {
        softwareLanguageService.delete(deleteSoftwareLanguageRequest);
    }

    @PutMapping("/update")
    public void update(@RequestBody UpdateSoftwareLanguageRequest updateSoftwareLanguageRequest) throws Exception {
        softwareLanguageService.update(updateSoftwareLanguageRequest);
    }
}
