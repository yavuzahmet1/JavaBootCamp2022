package com.kodlama.io.devweek5.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "softwarelanguages")
public class SoftwareLanguage {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "software_language_name")
    private String softwareLanguageName;

}
