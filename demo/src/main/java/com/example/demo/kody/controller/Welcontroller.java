package com.example.demo.kody.controller;

import com.example.demo.kody.service.Services;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequiredArgsConstructor
@RequestMapping("/kody")
public class Welcontroller {
    private final Services service;

    @PostMapping("/create")
    public String test(@RequestBody String q){
        service.setq(q);
        return q;
    }

    @GetMapping("/answer")
    public ModelAndView test1(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("asdf.html");
        return modelAndView;
    }

    @PostMapping("/answer")
    public String test1(@RequestBody String a){
        service.getq();
        service.seta(a);
        service.geta();
        return a;
    }

}
