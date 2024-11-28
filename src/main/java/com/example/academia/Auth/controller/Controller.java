package com.example.academia.Auth.controller;

import com.example.academia.Auth.jwtutil;
import com.example.academia.Service.CourseService;
import com.example.academia.dto.*;
import io.jsonwebtoken.Claims;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/courses")
public class Controller {
    private final CourseService courseScheduleService;
    private final jwtutil jwtUtil;

    /**
     * Fetch the timetable for a specific specialization.
     *
     * @param specializationDTO SpecializationDTO containing the specialization.
     * @return List of CourseScheduleDTO.
     */
    @PostMapping("/timetable")
    public ResponseEntity<List<CourseScheduleDTO>> getTimetableBySpecialization(
            @RequestBody Specialization specializationDTO,@RequestHeader(value = "Authorization") String token) {
        // Use the token from the request header



        if (token == null || !jwtUtil.validateToken(token)) {
            return ResponseEntity.status(401).body(null); // Unauthorized if the token is invalid or missing
        }

        String specialization = specializationDTO.getName();
        List<CourseScheduleDTO> scheduleDTOs = courseScheduleService.getTimetableWithFacultyByDomain(specialization);
        return ResponseEntity.ok(scheduleDTOs);
    }

}
