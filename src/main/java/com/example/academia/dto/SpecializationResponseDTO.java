package com.example.academia.dto;


import com.fasterxml.jackson.annotation.JsonProperty;

public class SpecializationResponseDTO {

    @JsonProperty("specialization_id")
    private Long specializationId;

    @JsonProperty("specialization_name")
    private String specializationName;

    // Getters and Setters
    public Long getSpecializationId() {
        return specializationId;
    }

    public void setSpecializationId(Long specializationId) {
        this.specializationId = specializationId;
    }

    public String getSpecializationName() {
        return specializationName;
    }

    public void setSpecializationName(String specializationName) {
        this.specializationName = specializationName;
    }
}
