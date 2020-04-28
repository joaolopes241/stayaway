package org.academiadecodigo.ramsters.hackathon.controller;

import org.academiadecodigo.ramsters.hackathon.converters.BeachToBeachDto;
import org.academiadecodigo.ramsters.hackathon.services.AuthService;
import org.academiadecodigo.ramsters.hackathon.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

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

    @RequestMapping(method = RequestMethod.GET, path = "/favorites")
    public String showFavorites(Model model) {
        model.addAttribute("favorites", beachToBeachDto.convert(authService.getAccessingCustomer().getFavorites()));
        return "favorites/list";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/about")
    public String showAbout(Model model) {
        return "about";
    }

}
