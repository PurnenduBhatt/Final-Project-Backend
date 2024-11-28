package com.example.academia.repo;


import com.example.academia.Entity.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;
@Component
public interface UserRepository extends JpaRepository<user, Long> {
    Optional<user> findByUsername(String username);
}
