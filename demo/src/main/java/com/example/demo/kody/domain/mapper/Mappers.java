package com.example.demo.kody.domain.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface Mappers {
    @Insert("INSERT INTO welcome (Q) VALUE (#{Q})")
    void setQ(@Param("Q") String Q);

    @Insert("INSERT INTO welcome (A) VALUES (#{A}) WHERE ID = #(ID)")
    void setA(String A, String ID);

    @Select("SELECT A FROM welcome")
    String getA();

    @Select("SELECT Q FROM welcome")
    String getQ();


}
