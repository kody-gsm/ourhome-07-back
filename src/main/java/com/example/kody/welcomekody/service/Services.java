package com.example.kody.welcomekody.service;


import com.example.kody.welcomekody.domain.DTO.Datas;
import com.example.kody.welcomekody.domain.mapper.Mappers;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class Services {
    private final Mappers mappers;

    public void setq(String datas){
        mappers.setQ(datas);
    }

    public void seta(String A, String ID){
        Datas datas = new Datas();
    }

    public String getq(){
        return mappers.getA();
    }

    public String geta(){
        return mappers.getQ();
    }
}
