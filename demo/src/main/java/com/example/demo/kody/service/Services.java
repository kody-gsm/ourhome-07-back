package com.example.demo.kody.service;


import com.example.demo.kody.domain.mapper.Mappers;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class Services {
    private final Mappers mappers;

    public void setq(String Q){
        mappers.setQ(Q);
    }

    public void seta(String A, String ID){
        mappers.setA(A, ID);
    }

    public String getq(){
        return mappers.getA();
    }

    public String geta(){
        return mappers.getQ();
    }
}
