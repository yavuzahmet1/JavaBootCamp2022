package Kodlama.io.Devs.kodlama.io.dataAccess.abstracts;

import Kodlama.io.Devs.kodlama.io.entity.concretes.SoftwareLanguage;


import java.util.List;

public interface SoftwareLanguageDao {
    List<SoftwareLanguage> getAll();

    SoftwareLanguage getById(int id);

    SoftwareLanguage add(SoftwareLanguage softwareLanguage) throws Exception;

    void delete(int id);

    SoftwareLanguage update(int id, SoftwareLanguage softwareLanguage);


}
