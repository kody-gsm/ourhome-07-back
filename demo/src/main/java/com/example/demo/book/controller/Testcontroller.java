package com.example.demo.book.controller;


import com.example.demo.book.domain.dto.ReponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testcontroller {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello/dto")
    public ReponseDto hello(@RequestParam("name") String name,@RequestParam("amount") int amount){
        return new ReponseDto(name,amount);
    }
}
