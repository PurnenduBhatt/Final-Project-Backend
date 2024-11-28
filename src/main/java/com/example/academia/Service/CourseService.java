package com.example.academia.Service;



import com.example.academia.Entity.CourseSchedule;
import com.example.academia.Entity.StudentCourse;
import com.example.academia.dto.CourseScheduleDTO;
import com.example.academia.dto.StudentCourseResponseDTO;
import com.example.academia.mapper.ProjectMapper;
import com.example.academia.repo.StudentCoursesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.example.academia.repo.CourseScheduleRepository;

import java.util.List;
import java.util.stream.Collectors;

@Component
@Service

@RequiredArgsConstructor
public class CourseService {
    @Autowired
    StudentCoursesRepository studentCoursesRepository;
    private final CourseScheduleRepository courseScheduleRepository;

    public List<CourseScheduleDTO> getTimetableWithFacultyByDomain(String specialization) {
        List<CourseSchedule> courseSchedules = courseScheduleRepository.findBySpecialization(specialization);

        return courseSchedules.stream()
                .map(ProjectMapper::toDTO)
                .collect(Collectors.toList());
    }

    public List<StudentCourseResponseDTO> getStudentCoursesByCourseName(String courseName) {
        List<StudentCourse> studentCourses = studentCoursesRepository.findByCourseName(courseName);
        return ProjectMapper.toResponseDTOList(studentCourses);
    }
}


