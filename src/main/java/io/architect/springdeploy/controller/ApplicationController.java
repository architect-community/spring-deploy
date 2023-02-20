package io.architect.springdeploy.controller;

import io.architect.springdeploy.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;

    @RequestMapping(
            value  = "/",
            method = RequestMethod.GET
    )
    public ResponseEntity<String> getWelcomeMessage() {
        String welcomeMessage = applicationService.getWelcomeMessage();
        return ResponseEntity.ok(welcomeMessage);
    }
}
