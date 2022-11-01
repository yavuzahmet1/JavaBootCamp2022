package Kodlama.io.Devs.kodlama.io.controller;

import Kodlama.io.Devs.kodlama.io.business.abstracts.SoftwareLanguageService;
import Kodlama.io.Devs.kodlama.io.entity.concretes.SoftwareLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class SoftwareLanguageController {
    private SoftwareLanguageService softwareLanguageService;

    @Autowired
    public SoftwareLanguageController(SoftwareLanguageService softwareLanguageService) {
        this.softwareLanguageService = softwareLanguageService;
    }

    @GetMapping("/getall")
    public List<SoftwareLanguage> getAll() {

        return this.softwareLanguageService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody SoftwareLanguage softwareLanguage) throws Exception {
        this.softwareLanguageService.add(softwareLanguage);
    }

    @GetMapping("/getbyid/{id}")
    public SoftwareLanguage getById(@PathVariable("id") int id) {

        return this.softwareLanguageService.getById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody SoftwareLanguage softwareLanguage) throws Exception {
        this.softwareLanguageService.update(softwareLanguage);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody SoftwareLanguage softwareLanguage){

        this.softwareLanguageService.delete(softwareLanguage);
    }

}
