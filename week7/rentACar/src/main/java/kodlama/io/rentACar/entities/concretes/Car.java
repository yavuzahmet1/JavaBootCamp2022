package kodlama.io.rentACar.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//sen 1 1 arttır demektir.
    @Column(name = "id")
    private int id;

    @Column(name = "plate")
    private String plate;

    @Column(name = "daily_price")
    private String dailyPrice;

    @Column(name = "model_year")
    private int modelYear;

    @Column(name = "state")
    private String state;//1-aviable, 2-rented, 3-maintance
}
