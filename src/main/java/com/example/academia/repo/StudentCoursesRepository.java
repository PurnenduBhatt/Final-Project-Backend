package com.example.academia.repo;

import com.example.academia.Entity.StudentCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
@Component
public interface StudentCoursesRepository extends JpaRepository<StudentCourse, Long> {

    @Query("SELECT sc FROM StudentCourse sc " +
            "JOIN FETCH sc.student st " +
            "JOIN FETCH sc.course c " +
            "LEFT JOIN FETCH sc.grade g " +
            "WHERE c.courseName = :courseName")
List<StudentCourse>findByCourseName(@Param("courseName") String courseName);
}


