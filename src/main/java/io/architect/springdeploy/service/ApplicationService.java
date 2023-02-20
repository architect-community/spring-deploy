package io.architect.springdeploy.service;

import org.springframework.stereotype.Service;
@Service
public class ApplicationService {

    public String getWelcomeMessage() {
        return "Hello from Spring Boot!";
    }
}
