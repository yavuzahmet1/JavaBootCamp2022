package kodlama.io.rentACar.repository;

import kodlama.io.rentACar.entity.Technology;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnologyRepository extends JpaRepository <Technology,Long> {
}
