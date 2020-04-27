package org.academiadecodigo.ramsters.hackathon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

    public String home() {
        return "redirect:/index";
    }
}
