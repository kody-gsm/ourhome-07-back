package com.example.demo.kody.controller;

import com.example.demo.kody.service.Services;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/kody")
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
public class Welcontroller {
    private final Services service;


    @PostMapping("/create")
    public String test(@RequestBody Map<String, String> q){
        System.out.println(q.get("question"));
        service.setq(q.get("question"));
        return "Created";
    }

    @GetMapping("/answer")
    public ModelAndView test1(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("asdf.html");
        return modelAndView;
    }

    @PostMapping("/answer")
    public String test1(@RequestBody String a, String ID){
        service.getq();
        service.seta(a, ID);
        service.geta();
        return a;
    }
}
