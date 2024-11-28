package com.example.academia.Auth.controller;

import com.example.academia.Auth.jwtutil;
import com.example.academia.Service.CourseService;
import com.example.academia.dto.CourseName;
import com.example.academia.dto.StudentCourseResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private CourseService studentService;
    private final jwtutil jwtUtil;

    public StudentController(jwtutil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/by-course-name")
    public ResponseEntity<List<StudentCourseResponseDTO>> getStudentsByCourseName(
            @RequestBody CourseName courseNameDTO,@RequestHeader(value = "Authorization") String token
            ) {

        // Extract the token from the Authorization header

        // Validate the token
        if (token == null || !jwtUtil.validateToken(token)) {
            return ResponseEntity.status(401).body(null); // Unauthorized if the token is invalid or missing
        }

        List<StudentCourseResponseDTO> students = studentService.getStudentCoursesByCourseName(courseNameDTO.getCourseName());
        return ResponseEntity.ok(students);
    }
}