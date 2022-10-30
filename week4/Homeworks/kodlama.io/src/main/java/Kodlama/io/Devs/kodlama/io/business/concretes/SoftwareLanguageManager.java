package Kodlama.io.Devs.kodlama.io.business.concretes;

import Kodlama.io.Devs.kodlama.io.business.abstracts.SoftwareLanguageService;
import Kodlama.io.Devs.kodlama.io.dataAccess.abstracts.SoftwareLanguageDao;
import Kodlama.io.Devs.kodlama.io.entity.concretes.SoftwareLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftwareLanguageManager implements SoftwareLanguageService {
    private SoftwareLanguageDao softwareLanguageDao;

    @Autowired
    public SoftwareLanguageManager(SoftwareLanguageDao softwareLanguageDao) {
        this.softwareLanguageDao = softwareLanguageDao;
    }

    @Override
    public List<SoftwareLanguage> getAll() {

        return this.softwareLanguageDao.getAll();
    }

    @Override
    public void add(SoftwareLanguage softwareLanguage) {


    }

    @Override
    public void delete(SoftwareLanguage softwareLanguage) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(SoftwareLanguage softwareLanguage) {

    }
}
