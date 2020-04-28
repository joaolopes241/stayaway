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

        List<Beach> beachList = new LinkedList<>();
        Beach beach1 = new Beach();
        beach1.setId(1);
        beach1.setName("Praia da Cova");
        beach1.setAddress("Rua da Esquinxima");
        beach1.setImg("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.carvoeirovillas.com%2Fen%2Fexplore%2Fexplore-carvoeiro%2Fitem%2F950-praia-da-cova-redonda&psig=AOvVaw3xoTkJ8SXyZ5Rku8fGkGTP&ust=1588169569262000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCMir9Ommi-kCFQAAAAAdAAAAABAI");
        beach1.setStatus(0);
        beachList.add(beach1);




     /*   (2,'Praia da Santa Rita', 'Rua da ais próxima', 'https://www.google.com/url?sa=i&url=https%3A%2F%2Fjornaldemafra.pt%2F2018%2F08%2F23%2Ftorres-vedras-resgate-d-praticante-de-parapente-na-praia-de-santa-rita%2F&psig=AOvVaw03VVtCjcF2f_e0-4sKH3rX&ust=1588169678864000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCOC06qKni-kCFQAAAAAdAAAAABAD', 0),
        (3,'Praia da Mexelhoa', 'Rua da Esróxima', 'https://www.google.com/url?sa=i&url=https%3A%2F%2Fjornaldemafra.pt%2F2018%2F08%2F23%2Ftorres-vedras-resgate-d-praticante-de-parapente-na-praia-de-santa-rita%2F&psig=AOvVaw03VVtCjcF2f_e0-4sKH3rX&ust=1588169678864000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCOC06qKni-kCFQAAAAAdAAAAABAD', 0),*/



        try {

            List<Beach> beaches = beachService.list();
            System.out.println(beaches.size());

            if (beaches == null) {
                throw new StayAwayException("ERROR");
            }


            return new ResponseEntity<>(beachList, HttpStatus.OK);

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
