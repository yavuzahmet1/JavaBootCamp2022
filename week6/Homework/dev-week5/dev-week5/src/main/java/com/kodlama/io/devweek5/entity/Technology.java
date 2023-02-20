package com.kodlama.io.devweek5.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="tecnologies")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","Lazy"})
public class Technology {
    @Id
    @Column(name="technology_id")
    private int technologyId;
    @Column(name="technology_name")
    private String technologyName;




}
