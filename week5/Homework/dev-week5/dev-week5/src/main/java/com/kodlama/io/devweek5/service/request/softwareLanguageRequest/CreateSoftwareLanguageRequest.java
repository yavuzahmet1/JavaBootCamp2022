package com.kodlama.io.devweek5.service.request.softwareLanguageRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateSoftwareLanguageRequest {
    private String name;
    private List<Integer> technologyIds;
}
