package com.example.demo.mapper;

import com.example.demo.domain.Cody;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface Codymapper {

    @Select("select count(boardID) from test")
    int boardCount();

    @Select("SELECT * FROM test")
    List<Cody> getlist();

    @Insert("INSERT INTO test (title, name, content) values (#{title},#{name},#{content})")
    void insertCody(Cody cody);

    @Insert("INSERT INTO user(name, PW) values (#{name},#{PW})")
    void insertUSER(Cody cody);
}
