package com.example.demo.cody.controller;

import com.example.demo.cody.service.CodyService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping("fortune")
@RequiredArgsConstructor
public class Microcontroller {
    private final CodyService service;

    @GetMapping(value = "/main")
    public ModelAndView Main(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("main.html");
        return modelAndView;
    }

    @GetMapping(value = "/test")
    public ModelAndView Test(Model model) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("test.html");
        model.addAttribute("cnt", service.boardCount());
        model.addAttribute("test", service.boardList());
        return modelAndView;
    }

    @GetMapping ("/login")
    public ModelAndView LoginForm(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login.html");
        return modelAndView;
    }

    @PostMapping("/login")
    public String Login(Model model){
        return "redirect:/fortune/main";
    }
}