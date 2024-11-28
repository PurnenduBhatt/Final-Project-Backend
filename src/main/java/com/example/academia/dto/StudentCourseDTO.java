package com.example.academia.dto;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class StudentCourseDTO implements Serializable {
    @JsonProperty("id")
    private Long id;

    @JsonProperty("student_id")
    private Long studentId;

    @JsonProperty("course_id")
    private Long courseId;

    @JsonProperty("grade_id")
    private Long gradeId;

    @JsonProperty("comments")
    private String comments;

    @JsonProperty("specialization")
    private String specialization;

    // Getters and Setters
}

