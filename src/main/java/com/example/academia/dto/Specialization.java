package com.example.academia.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Specialization implements Serializable {


    @JsonProperty("name")
    private String name;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getters and Setters
}
