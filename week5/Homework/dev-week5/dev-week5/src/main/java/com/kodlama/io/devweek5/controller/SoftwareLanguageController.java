package com.kodlama.io.devweek5.controller;

import com.kodlama.io.devweek5.service.abstracts.SoftwareLanguageService;
import com.kodlama.io.devweek5.service.request.softwareLanguageRequest.AddSoftwareLanguageRequest;
import com.kodlama.io.devweek5.service.response.softwareLanguageResponse.GetAllSoftwareLanguageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class SoftwareLanguageController {
    @Autowired
    private SoftwareLanguageService softwareLanguageService;

    @GetMapping("getall")
    public List<GetAllSoftwareLanguageResponse> getAll(){
        return softwareLanguageService.getAll();
    }

    @PostMapping("add")
    public void add(AddSoftwareLanguageRequest addSoftwareLanguageRequest){
        softwareLanguageService.add(addSoftwareLanguageRequest);
    }

}
