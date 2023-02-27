package kodlama.io.rentACar.dto.requests;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateBrandRequest {//İstek
    //niye name isteğinde bulunduk? çünkü id otomatik artarak kayıt ediliyor o yüzden ona gerek yok
    private String name;
}
