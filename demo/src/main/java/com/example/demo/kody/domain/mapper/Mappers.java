package com.example.demo.kody.domain.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface Mappers {
    @Insert("INSERT INTO welcome (Q) VALUES (#{Q})")
    void setQ(String Q);

    @Insert("INSERT INTO welcome (A) VALUES (#{A})")
    void setA(String A);

    @Select("SELECT A FROM welcome")
    String getA();

    @Select("SELECT Q FROM welcome")
    String getQ();


}
