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
    List<SoftwareLanguage> languageList;

    @Autowired
    public SoftwareLanguageManager(SoftwareLanguageDao softwareLanguageDao) {
        this.softwareLanguageDao = softwareLanguageDao;
    }

    @Override
    public List<SoftwareLanguage> getAll() {
        return this.softwareLanguageDao.getAll();
    }

    @Override
    public SoftwareLanguage getById(int id) {
        return this.softwareLanguageDao.getById(id);
    }

    @Override
    public void add(SoftwareLanguage softwareLanguage) throws Exception {
        if (isBlankName(softwareLanguage) || isExist(softwareLanguage)) {
            throw new Exception("Name must not be blank");

        } else if (isExist(softwareLanguage)) {
            throw new Exception("You want to add language is exist");
        }
        this.softwareLanguageDao.add(softwareLanguage);

    }

    @Override
    public void delete(SoftwareLanguage softwareLanguage) {
        this.softwareLanguageDao.delete(softwareLanguage);
    }

    @Override
    public void update(SoftwareLanguage softwareLanguage) throws Exception{
        if (isExist(softwareLanguage)||isBlankName(softwareLanguage)){
        this.softwareLanguageDao.update(softwareLanguage);
        }
    }


    public boolean isBlankName(SoftwareLanguage softwareLanguage) throws Exception{
        if(softwareLanguage.getName().isEmpty()||softwareLanguage.getName().isBlank()) {
           throw new Exception("Name must not be blank or empty");
        }
        return false;
    }


    public boolean isExist(SoftwareLanguage softwareLanguage) throws Exception{
        languageList=softwareLanguageDao.getAll();
        for (SoftwareLanguage sfL:languageList){
            if (sfL.getName().equalsIgnoreCase(softwareLanguage.getName())){
                throw new Exception("This language is already exist");

            }
        }

        return false;
    }
}
