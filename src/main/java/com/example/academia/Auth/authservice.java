package com.example.academia.Auth;


import com.example.academia.Entity.user;
import com.example.academia.dto.LoginRequestDTO;
import com.example.academia.dto.LoginResponseDTO;
import com.example.academia.repo.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class authservice {
    @Autowired
    private UserRepository userRepository;

    private final PasswordEncoder passwordencoder;

    private jwtutil jwtUtil;



    public LoginResponseDTO login(LoginRequestDTO request) {
        Optional<user> user = userRepository.findByUsername(request.getUsername());
        System.out.println(user.get().getPassword());

        System.out.println(passwordencoder.matches(request.getPassword(), user.get().getPassword()));
        jwtUtil = new jwtutil();
        String password=jwtUtil.encode(request.getPassword());
        System.out.println(password);

        if (user.isPresent() && password.equals(user.get().getPassword())) {
            String token = jwtUtil.generateToken(user.get().getUsername());
            LoginResponseDTO response = new LoginResponseDTO();
            response.setToken(token);
            return response;
        }

        throw new RuntimeException("Invalid username or password");
    }
}

