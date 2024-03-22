package com.example.demo.cody.service;

import com.example.demo.cody.domain.DTO.Cody;
import com.example.demo.cody.domain.mapper.Codymapper;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class CodyService {
    private final Codymapper codymapper;

    public int boardCount(){
        return codymapper.boardCount();
    }

    public List<Cody> boardList(){
        return codymapper.getlist();
    }

    public void insertCody(){
        Cody cody = new Cody();
    }

    public void insertUser(String ID, String PW) {
        Cody cody = new Cody();
    }
}
