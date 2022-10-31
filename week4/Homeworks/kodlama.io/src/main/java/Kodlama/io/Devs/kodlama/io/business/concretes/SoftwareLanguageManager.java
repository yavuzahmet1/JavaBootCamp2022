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
    public SoftwareLanguage getById(int id) {
        return softwareLanguageDao.getById(id);
    }

    @Override
    public SoftwareLanguage add(SoftwareLanguage softwareLanguage) throws Exception {
        if (isBlankName(softwareLanguage) || isExist(softwareLanguage)) {
            throw new Exception("Name must not be blank");

        } else if (isExist(softwareLanguage)) {
            throw new Exception("You want to add language is exist");
        }
        return softwareLanguageDao.add(softwareLanguage);

    }

    @Override
    public void delete(int id) {
        softwareLanguageDao.delete(id);
    }

    @Override
    public SoftwareLanguage update(int id, SoftwareLanguage softwareLanguage) {
        return softwareLanguageDao.update(id,softwareLanguage);
    }

    @Override
    public boolean isBlankName(SoftwareLanguage softwareLanguage) {
        if(softwareLanguage.getName().isEmpty()||softwareLanguage.getName().isBlank()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isExist(SoftwareLanguage softwareLanguage) {
        for (SoftwareLanguage sf:softwareLanguageDao.getAll()){
            if (sf.getName().equalsIgnoreCase(softwareLanguage.getName())){
                return true;
            }
        }

        return false;
    }
}
