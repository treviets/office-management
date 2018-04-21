package com.office.gui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController { 

    @GetMapping(path = "/login")
    public String login(Model model) {
        return "login";
    }
    
    @PostMapping(path = "/login")
    public String navigate() {
    	
    	return "main-layout";
    }
   

}