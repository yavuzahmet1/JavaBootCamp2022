package com.kodlama.io.devweek5.controller;

import java.util.List;

import com.kodlama.io.devweek5.entity.Technology;
import com.kodlama.io.devweek5.service.abstracts.TechnologyService;
import com.kodlama.io.devweek5.service.request.technologyRequest.DeleteTechnologyRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/technologies")
public class TechnologyController {
    @Autowired
    private TechnologyService technologyService;

    @PostMapping("/add")
    public void addTechnology(@RequestBody Technology technology) {

    }

    @DeleteMapping("/delete")
    public void deleteTechnology(DeleteTechnologyRequest deleteTechnologyRequest) {


    }

    @PutMapping("/update")
    public void updateTechnology(Technology technology) {
        System.out.println("Teknoloji güncelleme");
    }

    @GetMapping("/getall")
    List<Technology> getAllTechnology() {

        System.out.println("Teknoloji hepsini getirir");
    return null;
    }
}
