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

    @Column(name = "plate", unique = true)
    private String plate;

    @Column(name = "daily_price")
    private double dailyPrice;

    @Column(name = "model_year")
    private int modelYear;

    @Column(name = "state")
    private int state;//1-aviable, 2-rented, 3-maintance

    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model model;
}
