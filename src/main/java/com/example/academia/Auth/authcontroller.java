package com.example.academia.Auth;


import com.example.academia.dto.LoginRequestDTO;
import com.example.academia.dto.LoginResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@CrossOrigin(origins = "http://localhost:3000")  // Allow only localhost:3000.
@RestController
@RequestMapping("/api/auth")
public class authcontroller {

    private final authservice authService;

    public authcontroller(authservice authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDTO> login(@RequestBody LoginRequestDTO request) {
        System.out.println(request.getUsername());
        System.out.println(request.getPassword());
        return ResponseEntity.ok(authService.login(request));
    }
}
