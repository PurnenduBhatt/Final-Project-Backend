package com.example.academia.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginRequestDTO {
    @JsonProperty("username")

    private String username;

    @JsonProperty("password")

    private String password;
}

