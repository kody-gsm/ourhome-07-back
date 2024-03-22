package com.example.demo.cody.domain.DTO;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cody{
    //DB 구조
    private int boardID;
    private String title;
    private String content;
    private String name;
    private double memberID;
    private String PW;
}