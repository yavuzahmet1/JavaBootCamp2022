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
    public SoftwareLanguage getById(int id) throws Exception {
        for (SoftwareLanguage sfl : softwareLanguageDao.getAll()) {
            if (sfl.getId() == id) {
                return sfl;
            }
        }
        throw new Exception("Not exist this id : " + id);
    }

    @Override
    public void add(SoftwareLanguage softwareLanguage) throws Exception {
        if (softwareLanguage.getId() == 0) throw new Exception("Id is not empty!!");
        if (softwareLanguage.getName().isEmpty()) throw new Exception("Name can not be emptiy!!");
        for (SoftwareLanguage sfl : softwareLanguageDao.getAll()) {
            if (sfl.getName().toLowerCase().equals(softwareLanguage.getName().toLowerCase()) || sfl.getId() == softwareLanguage.getId()) {
                throw new Exception("Name is already exist");
            }
        }
        softwareLanguageDao.add(softwareLanguage);
    }

    @Override
    public void delete(int id) throws Exception {
        if (softwareLanguageDao.getAll().isEmpty()) throw new Exception("There is not language");
        for (SoftwareLanguage sfl : softwareLanguageDao.getAll()) {
            if (sfl.getId() == id) {
                softwareLanguageDao.delete(id);
                return;
            }
            throw new Exception("There is not language exist : " + id);
        }
    }

    @Override
    public void update(int id, SoftwareLanguage softwareLanguage) throws Exception {
        if (softwareLanguage.getName().isEmpty()) throw new Exception("You must not be language name");
        for (SoftwareLanguage sfl : softwareLanguageDao.getAll()) {
            if (sfl.getName().toLowerCase().equals(softwareLanguage.getName().toLowerCase())) {
                throw new Exception("Software Languange is already exist");
            }
        }
        softwareLanguageDao.update(id, softwareLanguage);

    }


 /*   public boolean isBlankName(SoftwareLanguage softwareLanguage) throws Exception{
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
    }*/
}
