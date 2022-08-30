package com.gharib.conference.controllers;


import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class registrationController {

    @GetMapping("/registration")
    public String registration(Map<String, Object> model){
        model.put("message","hi guest");
        return "registration";
    }
}
