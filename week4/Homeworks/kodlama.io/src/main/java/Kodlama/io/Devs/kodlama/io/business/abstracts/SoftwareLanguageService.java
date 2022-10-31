package Kodlama.io.Devs.kodlama.io.business.abstracts;

import Kodlama.io.Devs.kodlama.io.entity.concretes.SoftwareLanguage;

import java.util.List;

public interface SoftwareLanguageService {
    List<SoftwareLanguage> getAll();

    SoftwareLanguage getById(int id);
    SoftwareLanguage add(SoftwareLanguage softwareLanguage) throws Exception;

    void delete(int id);

    SoftwareLanguage update(int id,SoftwareLanguage softwareLanguage);
    boolean isBlankName(SoftwareLanguage softwareLanguage);
    boolean isExist(SoftwareLanguage softwareLanguage);

}
