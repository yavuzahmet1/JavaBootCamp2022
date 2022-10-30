package Kodlama.io.Devs.kodlama.io.entity.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class SoftwareLanguage {
    private Long id;
    private String softwareLanguage;

    public SoftwareLanguage() {
    }

    public SoftwareLanguage(Long id, String softwareLanguage) {
        super();
        this.id = id;
        this.softwareLanguage = softwareLanguage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSoftwareLanguage() {
        return softwareLanguage;
    }

    public void setSoftwareLanguage(String softwareLanguage) {
        this.softwareLanguage = softwareLanguage;
    }
}
