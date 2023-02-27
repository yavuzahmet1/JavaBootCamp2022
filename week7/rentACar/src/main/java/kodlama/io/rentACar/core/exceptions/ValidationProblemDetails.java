package kodlama.io.rentACar.core.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ValidationProblemDetails extends ProblemDetails{
    private Map<String,String> validationErrors;//hangi alanda ne hatası var onun için HasMap kullandık.
}
