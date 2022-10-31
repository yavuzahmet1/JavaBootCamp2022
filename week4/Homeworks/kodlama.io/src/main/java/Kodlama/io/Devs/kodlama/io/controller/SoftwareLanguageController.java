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

    @GetMapping("/getAll")
    public List<SoftwareLanguage> getAll() {

        return this.softwareLanguageService.getAll();
    }

    @PostMapping()
    public SoftwareLanguage add(@RequestBody SoftwareLanguage softwareLanguage) throws Exception {
        return softwareLanguageService.add(softwareLanguage);
    }

    @GetMapping("{id}")
    public SoftwareLanguage getById(@PathVariable("id") int id) {
        return softwareLanguageService.getById(id);
    }

    @PutMapping("{id}")
    public SoftwareLanguage update(@PathVariable("id") int id,@RequestBody SoftwareLanguage softwareLanguage){
        return softwareLanguageService.update(id,softwareLanguage);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") int id){
        softwareLanguageService.delete(id);
    }

}
