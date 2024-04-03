package com.example.welcome.kody.controller;

import com.example.welcome.kody.domain.DTO.Datas;
import com.example.welcome.kody.service.Services;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/kody")
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
@Transactional
public class Welcontroller {
    private final Services service;
    @PostMapping("/create")
    public String test(@RequestBody Map<String, String> q){
        service.setq(q.get("question"));
        return "Created";
    }

//    @GetMapping("/answer")asdasd
//    public ModelAndView test1(){
//        ModelAndView modelAndView = new ModelAndView();as
//        modelAndView.setViewName("asdf.html");
//        return modelAndView;
//    }
//
//    @PostMapping("/answer")
//    public String test1(@RequestBody String a, String ID){
//        service.getq();
//        service.seta(a, ID);
//        service.geta();
//        return a;
//    }
}