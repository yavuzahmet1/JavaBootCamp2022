package kodlama.io.rentACar.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "brands")
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//sen 1 1 arttır demektir.
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;
}

//Veribanına karlışık gelen isimler
//her entitiy için ayrı repository yazılması gerekecek
