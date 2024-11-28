package com.example.academia.SecurityConfig;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")  // Allow all paths.
                .allowedOrigins("http://localhost:3000")  // Allow frontend URL.
                .allowedMethods("GET", "POST", "PUT", "DELETE")  // Specify allowed methods.
                .allowedHeaders("*");  // Allow all headers.
    }
}
