package Kodlama.io.Devs.kodlama.io.business.abstracts;

import Kodlama.io.Devs.kodlama.io.entity.concretes.SoftwareLanguage;

import java.util.List;

public interface SoftwareLanguageService {
    List<SoftwareLanguage> getAll();
    void add(SoftwareLanguage softwareLanguage) throws Exception;
    void delete(SoftwareLanguage softwareLanguage);

    void delete(int id);

    void update(SoftwareLanguage softwareLanguage);
    boolean isBlankName(SoftwareLanguage softwareLanguage);
    boolean isExist(SoftwareLanguage softwareLanguage);

}
