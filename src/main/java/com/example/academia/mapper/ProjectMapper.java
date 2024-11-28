package com.example.academia.mapper;
import com.example.academia.Entity.CourseSchedule;
import com.example.academia.Entity.StudentCourse;
import com.example.academia.dto.CourseScheduleDTO;
import com.example.academia.dto.StudentCourseResponseDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProjectMapper {

    public static CourseScheduleDTO toDTO(CourseSchedule courseSchedule) {
        if (courseSchedule == null) {
            return null;
        }
        return CourseScheduleDTO.builder()
                .id(courseSchedule.getId())
                .courseId(courseSchedule.getCourse().getId())
                .courseName(courseSchedule.getCourse().getCourseName())
                .faculty(courseSchedule.getCourse().getFaculty()) // Assuming Course has a getFaculty method
                .dayOfWeek(courseSchedule.getDayOfWeek())
                .startTime(courseSchedule.getStartTime())
                .endTime(courseSchedule.getEndTime())
                .building(courseSchedule.getBuilding())
                .specialization(courseSchedule.getSpecialization())
                .roomNumber(courseSchedule.getRoomNumber())
                .build();
    }
    public static StudentCourseResponseDTO toResponseDTO(StudentCourse studentCourse) {
        StudentCourseResponseDTO dto = new StudentCourseResponseDTO();
        dto.setStudentId(studentCourse.getId());
        dto.setCourseName(studentCourse.getCourse().getCourseName());
        dto.setStudentName(studentCourse.getStudent().getFirstName() + " " + studentCourse.getStudent().getLastName());
        dto.setCourseId(studentCourse.getCourse().getId());
        dto.setGrade(studentCourse.getGrade() != null ? Long.valueOf(studentCourse.getGrade().getGradeValue()) : null);
        dto.setComments(studentCourse.getComments());
        dto.setSpecialization(studentCourse.getCourse().getSpecialization()); // Assuming `specialization` is part of the course entity
        return dto;
    }

    public static List<StudentCourseResponseDTO> toResponseDTOList(List<StudentCourse> studentCourses) {
        return studentCourses.stream().map(ProjectMapper::toResponseDTO).collect(Collectors.toList());
    }
}
