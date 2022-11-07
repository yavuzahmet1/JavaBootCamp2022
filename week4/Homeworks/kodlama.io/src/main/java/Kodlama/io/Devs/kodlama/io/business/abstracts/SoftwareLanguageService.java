package Kodlama.io.Devs.kodlama.io.business.abstracts;

import Kodlama.io.Devs.kodlama.io.entity.concretes.SoftwareLanguage;

import java.util.List;

public interface SoftwareLanguageService {
    List<SoftwareLanguage> getAll();

    SoftwareLanguage getById(int id)throws Exception;
    void add(SoftwareLanguage softwareLanguage) throws Exception;

    void delete(int id)throws Exception;

    void update(int id,SoftwareLanguage softwareLanguage) throws Exception;


}
