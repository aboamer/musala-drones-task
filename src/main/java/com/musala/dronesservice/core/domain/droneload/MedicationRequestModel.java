package com.musala.dronesservice.core.domain.droneload;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MedicationRequestModel {

    private String code;
    private String name;
    private Double weight;
    private String image;
}
