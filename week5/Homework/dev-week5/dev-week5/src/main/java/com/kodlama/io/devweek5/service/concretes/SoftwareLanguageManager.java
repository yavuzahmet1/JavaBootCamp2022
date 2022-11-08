package com.kodlama.io.devweek5.service.concretes;

import com.kodlama.io.devweek5.repository.abstracts.SoftwareLanguageRepository;
import com.kodlama.io.devweek5.service.abstracts.SoftwareLanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SoftwareLanguageManager implements SoftwareLanguageService {
    @Autowired
    private SoftwareLanguageRepository softwareLanguageRepository;

}
