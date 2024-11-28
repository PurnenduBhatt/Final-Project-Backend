package com.example.academia.dto;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CourseDTO implements Serializable {
    @JsonProperty("course_id")
    private Long courseId;

    @JsonProperty("course_code")
    private String courseCode;

    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }


    @JsonProperty("year")
    private Integer year;



    @JsonProperty("term")
    private String term;

    @JsonProperty("faculty")
    private String faculty;

    @JsonProperty("credits")
    private Integer credits;

    @JsonProperty("capacity")
    private Integer capacity;

    @JsonProperty("specialization")
    private String specialization;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
    // Getters and Setters
}
