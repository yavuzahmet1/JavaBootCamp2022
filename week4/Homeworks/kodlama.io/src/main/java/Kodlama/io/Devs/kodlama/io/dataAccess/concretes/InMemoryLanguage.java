package Kodlama.io.Devs.kodlama.io.dataAccess.concretes;

import Kodlama.io.Devs.kodlama.io.dataAccess.abstracts.SoftwareLanguageDao;
import Kodlama.io.Devs.kodlama.io.entity.concretes.SoftwareLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class InMemoryLanguage implements SoftwareLanguageDao {
    List<SoftwareLanguage> languages;

    public InMemoryLanguage() {
        languages = new ArrayList<SoftwareLanguage>();
        languages.add(new SoftwareLanguage(1, "C#"));
        languages.add(new SoftwareLanguage(2, "Java"));
        languages.add(new SoftwareLanguage(3, "Go"));
        languages.add(new SoftwareLanguage(4, "PHP"));
        languages.add(new SoftwareLanguage(5, "PHP"));
    }

    @Override
    public List<SoftwareLanguage> getAll() {

        return languages;
    }

    @Override
    public SoftwareLanguage getById(int id) {
        return languages.get(id);
    }


    @Override
    public SoftwareLanguage add(SoftwareLanguage softwareLanguage) throws Exception {
        languages.add(softwareLanguage);
        return softwareLanguage;
    }

    @Override
    public void delete(int id) {
        languages.remove(id-1);
    }

    @Override
    public SoftwareLanguage update(int id, SoftwareLanguage softwareLanguage) {

        return languages.set(id,softwareLanguage);
    }

}
