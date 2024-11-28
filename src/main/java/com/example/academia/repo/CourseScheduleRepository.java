package com.example.academia.repo;



import com.example.academia.Entity.CourseSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CourseScheduleRepository extends JpaRepository<CourseSchedule, Long> {

    /**
     * Find all course schedules by specialization (domain).
     *
     * @param specialization the specialization (domain) to filter schedules by.
     * @return a list of course schedules matching the specialization.
     */
    @Query("SELECT cs FROM CourseSchedule cs JOIN FETCH cs.course c WHERE cs.specialization = :specialization")
    List<CourseSchedule> findBySpecialization(@Param("specialization") String specialization);

}
