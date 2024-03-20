package com.example.dto;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@RequiredArgsConstructor
public class ReponseDto {
    private final String name;
    private final int amount;
}
