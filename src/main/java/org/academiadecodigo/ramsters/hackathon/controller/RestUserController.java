package org.academiadecodigo.ramsters.hackathon.controller;

import org.academiadecodigo.ramsters.hackathon.command.BeachDto;
import org.academiadecodigo.ramsters.hackathon.converters.BeachToBeachDto;
import org.academiadecodigo.ramsters.hackathon.exceptions.StayAwayException;
import org.academiadecodigo.ramsters.hackathon.persistence.model.Beach;
import org.academiadecodigo.ramsters.hackathon.persistence.model.User;
import org.academiadecodigo.ramsters.hackathon.services.AuthService;
import org.academiadecodigo.ramsters.hackathon.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class RestUserController {

    private AuthService authService;
    private UserService userService;
    private BeachToBeachDto beachToBeachDto;

    @Autowired
    public void setAuthService(AuthService authService) {
        this.authService = authService;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    public void setBeachToBeachDto(BeachToBeachDto beachToBeachDto) {
        this.beachToBeachDto = beachToBeachDto;
    }


}
