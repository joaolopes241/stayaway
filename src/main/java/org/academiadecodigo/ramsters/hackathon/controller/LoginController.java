package org.academiadecodigo.ramsters.hackathon.controller;

import org.academiadecodigo.ramsters.hackathon.command.UserDto;
import org.academiadecodigo.ramsters.hackathon.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("/login")
public class LoginController {

    private AuthService authService;

    @Autowired
    public void setAuthService(AuthService authService) {
        this.authService = authService;
    }

    @RequestMapping(method = RequestMethod.POST, path = "")
    public String login(@Valid @ModelAttribute UserDto userDto, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "/login";
        }

        if (authService.authenticate(userDto.getUsername(), userDto.getPass())) {
            return "/main";
        }

        return "/login";
    }
}
