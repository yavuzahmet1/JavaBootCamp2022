package com.kodlama.io.devweek5.service.request.softwareLanguageRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateSoftwareLanguageRequest {
    private int id;
    private String softName;
}
