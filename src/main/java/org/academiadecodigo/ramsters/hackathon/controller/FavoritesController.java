package org.academiadecodigo.ramsters.hackathon.controller;


import org.academiadecodigo.ramsters.hackathon.command.BeachDto;
import org.academiadecodigo.ramsters.hackathon.converters.BeachToBeachDto;
import org.academiadecodigo.ramsters.hackathon.exceptions.StayAwayException;
import org.academiadecodigo.ramsters.hackathon.persistence.model.Beach;
import org.academiadecodigo.ramsters.hackathon.persistence.model.User;
import org.academiadecodigo.ramsters.hackathon.services.BeachService;
import org.academiadecodigo.ramsters.hackathon.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


@RestController
@RequestMapping("/api")
public class FavoritesController {

    private BeachService beachService;
    private BeachToBeachDto beachToBeachDto;
    private UserService userService;

    @Autowired
    public void setBeachService(BeachService beachService) {
        this.beachService = beachService;
    }

    @Autowired
    public void setBeachToBeachDto(BeachToBeachDto beachToBeachDto) {
        this.beachToBeachDto = beachToBeachDto;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/beaches"})
    public ResponseEntity<List<Beach>> listBeachs() {

        try {

            List<Beach> beaches = beachService.list();

            if (beaches == null) {
                throw new StayAwayException("ERROR");
            }

            return new ResponseEntity<>(beaches, HttpStatus.OK);

        } catch (StayAwayException ex) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/user"})
    public ResponseEntity<List<User>> listUser() {

        try {

            List<User> users = userService.findAllUsers();

            if (users == null) {
                throw new StayAwayException("ERROR");
            }


            return new ResponseEntity<>(users, HttpStatus.OK);

        } catch (StayAwayException ex) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

}
