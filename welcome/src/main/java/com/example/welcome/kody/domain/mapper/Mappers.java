package com.example.welcome.kody.domain.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface Mappers {
    @Insert("INSERT INTO welcome (Q) VALUE (#{Q})")
    void setQ(String q);


//    @Insert("INSERT INTO welcome (A) VALUES (#{A}) WHERE ID = #({ID})")
//    void setA(String a);

    @Select("SELECT A FROM welcome")
    String getA();

    @Select("SELECT Q FROM welcome")
    String getQ();
}