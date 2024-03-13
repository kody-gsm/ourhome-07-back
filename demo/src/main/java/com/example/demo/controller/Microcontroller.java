package com.example.demo.controller;

import com.example.demo.service.CodyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("fortune")
@RequiredArgsConstructor
public class Microcontroller {

    private final CodyService service;

    @GetMapping("/main")
    public String Main(){
        return "main";
    }

    @GetMapping("/test")
    public String Test(Model model){
        model.addAttribute("cnt",service.boardCount());
        model.addAttribute("test",service.boardList());
        return "test";
    }

    @GetMapping ("/login")
    public String LoginForm(){
        return "login";
    }

    @PostMapping("/login")
    public String Login(Model model){
        return "redirect:/fortune/main";
    }
}