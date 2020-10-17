package com.sailes.jpa;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class MainController {

    @PostMapping("/hello")
    public String hello(){
        return "helooooo";
    }
}
