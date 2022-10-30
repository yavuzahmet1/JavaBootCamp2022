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
        languages=new ArrayList<SoftwareLanguage>();
        languages.add(new SoftwareLanguage(1L,"C#"));
        languages.add(new SoftwareLanguage(2L,"Java"));
        languages.add(new SoftwareLanguage(3L,"Go"));
        languages.add(new SoftwareLanguage(4L,"PHP"));
        languages.add(new SoftwareLanguage(5L,"PHP"));
    }

    @Override
    public List<SoftwareLanguage> getAll() {

        return languages;
    }

    @Override
    public SoftwareLanguage getById() {
        return null;
    }

}
