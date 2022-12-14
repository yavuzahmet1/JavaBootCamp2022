package Kodlama.io.Devs.kodlama.io.dataAccess.concretes;

import Kodlama.io.Devs.kodlama.io.dataAccess.abstracts.SoftwareLanguageDao;
import Kodlama.io.Devs.kodlama.io.entity.concretes.SoftwareLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class InMemoryLanguage implements SoftwareLanguageDao {
    List<SoftwareLanguage> languages;
    SoftwareLanguage sfL;

    public InMemoryLanguage() {
        languages = new ArrayList<SoftwareLanguage>();
        languages.add(new SoftwareLanguage(1, "C#"));
        languages.add(new SoftwareLanguage(2, "Java"));
        languages.add(new SoftwareLanguage(3, "Go"));

    }

    @Override
    public List<SoftwareLanguage> getAll() {

        return this.languages;
    }

    @Override
    public SoftwareLanguage getById(int id) {

        return languages.stream().filter(softwareLanguage -> softwareLanguage.getId()==id).findFirst().get();
    }


    @Override
    public void add(SoftwareLanguage softwareLanguage)  {
        this.languages.add(softwareLanguage);

    }


    @Override
    public void delete(int id) {

        languages.remove(getById(id));
    }

    @Override
    public void update(int id,SoftwareLanguage softwareLanguage){
        SoftwareLanguage softLang=getById(id);
        softLang.setName(softwareLanguage.getName());
    }

/*    private SoftwareLanguage findLanguage(int id) {
        SoftwareLanguage softLang=null;
        for (SoftwareLanguage fakeSoftLang:languages){
            if (fakeSoftLang.getId()==id){
                softLang=fakeSoftLang;
                break;
            }
        }
        return null;
    }*/

}
