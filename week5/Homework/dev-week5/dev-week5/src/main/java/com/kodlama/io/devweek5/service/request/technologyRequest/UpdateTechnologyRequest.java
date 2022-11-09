package com.kodlama.io.devweek5.service.request.technologyRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateTechnologyRequest {
    private int id;
    private String techName;
    private int fkForSoftId;
}
