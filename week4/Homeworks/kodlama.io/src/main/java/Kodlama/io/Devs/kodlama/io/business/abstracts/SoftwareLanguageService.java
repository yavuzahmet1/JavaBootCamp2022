package Kodlama.io.Devs.kodlama.io.business.abstracts;

import Kodlama.io.Devs.kodlama.io.entity.concretes.SoftwareLanguage;

import java.util.List;

public interface SoftwareLanguageService {
    List<SoftwareLanguage> getAll();

    SoftwareLanguage getById(int id);
    void add(SoftwareLanguage softwareLanguage) throws Exception;

    void delete(SoftwareLanguage softwareLanguage);

    void update(SoftwareLanguage softwareLanguage) throws Exception;


}
