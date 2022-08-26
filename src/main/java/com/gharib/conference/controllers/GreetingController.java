package com.gharib.conference.controllers;


import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/conference")
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(Map<String, Object> model){
        model.put("message","hi guest");
        return "index";
    }
}
