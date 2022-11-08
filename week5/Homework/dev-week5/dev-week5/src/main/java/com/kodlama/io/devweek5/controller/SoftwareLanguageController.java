package com.kodlama.io.devweek5.controller;

import com.kodlama.io.devweek5.service.abstracts.SoftwareLanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/languages")
public class SoftwareLanguageController {
    @Autowired
    private SoftwareLanguageService softwareLanguageService;

}
