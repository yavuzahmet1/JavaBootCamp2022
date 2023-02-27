package kodlama.io.rentACar.dataAccess.abstracts;

import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Integer> {
    //List<Brand> getAll();// getAll'ı çağıran birisi markaları listeler.
    //Jpa'yı extend ettikden sonra getAll'a gerek kalmadı(save,delete,update)
    //ve bunu imlements eden InMemory'de sildik gerek kalmadı
    boolean existsByName(String name);//varsa true yoksa false oluşturuyor. spring Jpa keywords dersek anahtar kelimeler karşımıza çıkar.




}
