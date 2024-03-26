package com.example.demo.welcome.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("welcome")
@RequiredArgsConstructor
public class welcontroller {
    @GetMapping("kody")
    public ModelAndView cody(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("welcome/index.html");
        return modelAndView;
    }
}
