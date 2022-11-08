package com.kodlama.io.devweek5.entity;
import com.kodlama.io.devweek5.entity.Technology;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "softwarelanguages")
public class SoftwareLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "software_language_name")
    private String softwareLanguageName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_soft_id",referencedColumnName = "id")
    private List<Technology> technologies;

/*
    SQL'de CASCADE , hem alt hem de üst tablodan bir girişi aynı anda
    silmek veya güncellemek için kullanılır. CASCADE anahtar sözcüğü ,
    ON DELETE veya ON UPDATE sorgusu yazılırken bağlaç olarak kullanılır .
    Üst tablo için yazılmış bir sorguya cascade anahtar sözcüğü eklenirse,
    sorgunun yürütülmesine göre hem üst hem de alt tablolar buna göre değişir.
*/

}
