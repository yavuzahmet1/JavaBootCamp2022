package com.kodlama.io.devweek5.service.response.technologyResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdTechnologyResponse {
    private int id;
    private String softName;
    private String techName;
    private int fkForSoftId;
}
