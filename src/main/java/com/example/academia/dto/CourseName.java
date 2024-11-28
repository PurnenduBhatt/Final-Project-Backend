package com.example.academia.dto;


import com.fasterxml.jackson.annotation.JsonProperty;

public class CourseName {
    @JsonProperty("course_name")
    private String courseName;

    // Getters and Setters
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}

