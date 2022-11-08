package com.kodlama.io.devweek5.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="tecnologies")
public class Technology {
    @Id
    @Column(name="technology_id")
    private int technologyId;
    @Column(name="technology_name")
    private String technologyName;




}
