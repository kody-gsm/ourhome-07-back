package com.example.demo.cody.controller;

import com.example.demo.cody.service.CodyService;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequiredArgsConstructor
public class Microcontroller {
    private final CodyService service;

    @GetMapping(value = "/main")
    public ModelAndView Main(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("kody/main.html");
        return modelAndView;
    }

    @GetMapping(value = "/test")
    public ModelAndView Test(Model model) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("kody/test.html");
        model.addAttribute("cnt", service.boardCount());
        model.addAttribute("test", service.boardList());
        return modelAndView;
    }

    @GetMapping ("/login")
    public ModelAndView LoginForm(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("kody/login.html");
        return modelAndView;
    }

    @PostMapping("/login")
    public String Login(Model model){
        return "redirect:/fortune/main";
    }

/*    @PostMapping("/testData")
    public Map<Integer, String> testData(@RequestBody Map<String, List<String>> str){
        System.out.println(str);
        Map<Integer, String> data = new HashMap<>();
        data.put(1,"사과");
        data.put(2,"배");
        data.put(3,"자두");

        int i = 4;
//        for(String param : str){
//            data.put(i,param);
//            i++;
//        }
        return data;
    }*/
}