package org.academiadecodigo.ramsters.hackathon.controller;

import org.academiadecodigo.ramsters.hackathon.command.UserDto;
import org.academiadecodigo.ramsters.hackathon.converters.UserDtoToUser;
import org.academiadecodigo.ramsters.hackathon.exceptions.StayAwayException;
import org.academiadecodigo.ramsters.hackathon.messages.Messages;
import org.academiadecodigo.ramsters.hackathon.persistence.model.User;
import org.academiadecodigo.ramsters.hackathon.services.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class RegisterController {

    private RegisterService registerService;
    private UserDtoToUser userDtoToUser;

    @Autowired
    public void setRegisterService(RegisterService registerService) {
        this.registerService = registerService;
    }

    @Autowired
    public void setUserDtoToUser(UserDtoToUser userDtoToUser) {
        this.userDtoToUser = userDtoToUser;
    }

    @RequestMapping(method = RequestMethod.POST, path = {"register/", "register"}, params = "action=save")
    public String saveCustomer(@Valid @ModelAttribute("customer") UserDto userDto, BindingResult bindingResult, RedirectAttributes redirectAttributes) {

        try {
            if (bindingResult.hasErrors()) {
                return new StayAwayException();
            }

            if (registerService.checkAvailability(userDto.getUsername())) {
                return new StayAwayException(Messages.USEREXISTS);
            }

            User savedCustomer = registerService.save(userDtoToUser.convert(userDto));

            redirectAttributes.addFlashAttribute("lastAction", "Saved " + savedCustomer.getFirstName() + " " + savedCustomer.getLastName());
            return "redirect:/register/" + savedCustomer.getFirstName() + savedCustomer.getLastName();

        } catch (StayAwayException ex) {

            redirectAttributes.addFlashAttribute("message", ex.getMessage());
            return "/register";

        }

    }


}
