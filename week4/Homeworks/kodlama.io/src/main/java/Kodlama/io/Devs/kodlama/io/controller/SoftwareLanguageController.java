package Kodlama.io.Devs.kodlama.io.controller;

import Kodlama.io.Devs.kodlama.io.business.abstracts.SoftwareLanguageService;
import Kodlama.io.Devs.kodlama.io.entity.concretes.SoftwareLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/language")
public class SoftwareLanguageController {
    private SoftwareLanguageService softwareLanguageService;

    @Autowired
    public SoftwareLanguageController(SoftwareLanguageService softwareLanguageService) {
        this.softwareLanguageService = softwareLanguageService;
    }

    @GetMapping("/getAll")
    public List<SoftwareLanguage> getAll(){

        return this.softwareLanguageService.getAll();
    }
    public void add(SoftwareLanguage softwareLanguage) throws Exception {
        softwareLanguageService.add(softwareLanguage);
    }
}
