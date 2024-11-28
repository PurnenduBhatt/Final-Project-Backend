package com.example.academia.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "course_schedule")
public class CourseSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;



    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;
    @Column(name = "course_name", length = 20)
    private String courseName;
    @Column(name = "faculty", length = 20)
    private String faculty;
    @Column(name = "day_of_week", length = 20)
    private String dayOfWeek;

    @Column(name = "start_time", columnDefinition = "TIME")
    private String startTime;

    @Column(name = "end_time", columnDefinition = "TIME")
    private String endTime;

    @Column(name = "building", length = 255)
    private String building;

    @Column(name = "specialization", length = 255, nullable = false)
    private String specialization;

    @Column(name = "room_number", length = 50)
    private String roomNumber;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Course getCourse() {
        return course;
    }



    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
}
