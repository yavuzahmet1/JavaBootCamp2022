package com.kodlama.io.devweek5.service.response.softwareLanguageResponse;

import com.kodlama.io.devweek5.service.response.technologyResponse.TecnologyListResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SoftwareLanguageResponse {
    private String name;

    List<TecnologyListResponse> tecnologyListResponses;
}
