package com.example.demo.cody.domain.DTO;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cody{
    //DB의 속성들
    private int boardID;
    private String title;
    private String content;
    private String name;
    private double memberID;
    private String PW;
}