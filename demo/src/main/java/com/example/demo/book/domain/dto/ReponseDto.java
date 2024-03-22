package com.example.demo.book.domain.dto;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ReponseDto {
    private final String name;
    private final int amount;
}
