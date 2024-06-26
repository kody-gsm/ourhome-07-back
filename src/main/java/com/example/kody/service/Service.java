package com.example.kody.service;

import com.example.kody.domain.mapper.Mappers;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class Service {
    private final Mappers mappers;

    public void setQ(String question){
        mappers.setQ(question);
    }

    public String getQ(double ID){
        return mappers.getQ(ID);
    }

    public double getMax(){
        return mappers.getMAX();
    }
}
