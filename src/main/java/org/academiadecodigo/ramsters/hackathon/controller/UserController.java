package org.academiadecodigo.ramsters.hackathon.controller;

import org.academiadecodigo.ramsters.hackathon.converters.BeachToBeachDto;
import org.academiadecodigo.ramsters.hackathon.persistence.model.Beach;
import org.academiadecodigo.ramsters.hackathon.services.AuthService;
import org.academiadecodigo.ramsters.hackathon.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

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

    @RequestMapping(method = RequestMethod.GET, path = "/about")
    public String showAbout(Model model) {
        return "about";
    }



}
