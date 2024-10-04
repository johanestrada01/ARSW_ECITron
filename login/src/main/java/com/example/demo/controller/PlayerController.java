package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/player")
public class PlayerController {
    
    @GetMapping("/prueba")
    public String prueba() {
        return "prueba";
    }
    
}
