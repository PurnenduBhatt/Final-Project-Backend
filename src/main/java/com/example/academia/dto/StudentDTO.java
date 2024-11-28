package com.example.academia.dto;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class StudentDTO implements Serializable {
    @JsonProperty("student_id")
    private Long studentId;

    @JsonProperty("roll_number")
    private String rollNumber;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("email")
    private String email;

    @JsonProperty("photograph_path")
    private String photographPath;

    @JsonProperty("total_credits")
    private Integer totalCredits;

    @JsonProperty("graduation_year")
    private Integer graduationYear;

    // Getters and Setters
}

