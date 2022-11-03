package kodlama.io.rentACar.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllBrandsResponse {//verilen data
    private int id;                 //İki datayı vermek istediğimizden bunları tanımladık
    private String name;
}
