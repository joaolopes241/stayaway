package org.academiadecodigo.ramsters.hackathon.controller;

import org.academiadecodigo.ramsters.hackathon.command.UserDto;
import org.academiadecodigo.ramsters.hackathon.errors.Errors;
import org.academiadecodigo.ramsters.hackathon.exceptions.StayAwayException;
import org.academiadecodigo.ramsters.hackathon.exceptions.UsernameNotAvailable;
import org.academiadecodigo.ramsters.hackathon.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class LoginController {

    private AuthService authService;

    @Autowired
    public void setAuthService(AuthService authService) {
        this.authService = authService;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/login")
    public String login() {
        return "/login";
    }

    @RequestMapping(method = RequestMethod.POST, path = "/login")
    public String login(@Valid @ModelAttribute UserDto userDto, BindingResult bindingResult, RedirectAttributes redirectAttributes) throws StayAwayException {
        userDto.setEmail("sfdsdfsd");
        userDto.setFirstName("adsdsa");
        userDto.setLastName("asdsdasd");
        userDto.setPhone("1294812094");

        try {

            if (bindingResult.hasErrors()) {
                return "/login";
            }

            if (!authService.authenticate(userDto.getUsername(), userDto.getPass())) {
                throw new UsernameNotAvailable(Errors.USER_NOT_FOUND);
            }

            return "index";

        } catch (UsernameNotAvailable ex) {

            redirectAttributes.addFlashAttribute("message", ex.getMessage());
            return "/login";
        }
    }
}
