package org.academiadecodigo.ramsters.hackathon.controller;

import org.academiadecodigo.ramsters.hackathon.command.UserDto;
import org.academiadecodigo.ramsters.hackathon.converters.UserDtoToUser;
import org.academiadecodigo.ramsters.hackathon.exceptions.StayAwayException;
import org.academiadecodigo.ramsters.hackathon.exceptions.UsernameNotAvailable;
import org.academiadecodigo.ramsters.hackathon.errors.Errors;
import org.academiadecodigo.ramsters.hackathon.persistence.model.User;
import org.academiadecodigo.ramsters.hackathon.services.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

    @RequestMapping(method = RequestMethod.POST, path = {"/register"})
    public String saveCustomer(@RequestParam("username") String username,
                               @RequestParam("password") String password,
                               @RequestParam("firstName") String firstName,
                               @RequestParam("lastName") String lastName,
                               @RequestParam("email") String email,
                               @RequestParam("phone") String phone,
                               RedirectAttributes redirectAttributes) throws StayAwayException {

        UserDto userDto = new UserDto();
        userDto.setUsername(username);
        userDto.setPass(password);
        userDto.setFirstName(firstName);
        userDto.setLastName(lastName);
        userDto.setEmail(email);
        userDto.setPhone(phone);

        try {

            if (registerService.checkAvailability(userDto.getUsername())) {
                throw new UsernameNotAvailable(Errors.USERNAME_NOT_AVAILABLE);
            }

            User savedCustomer = registerService.save(userDtoToUser.convert(userDto));

            redirectAttributes.addFlashAttribute("lastAction", "Saved " + savedCustomer.getFirstName() + " " + savedCustomer.getLastName());
            return "homepage";

        } catch (UsernameNotAvailable ex) {

            redirectAttributes.addFlashAttribute("message", ex.getMessage());
            return "homepage";

        }

    }


}
