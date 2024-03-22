package com.example.dto;

import com.example.demo.book.domain.dto.ReponseDto;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ReponseDtoTest {
    String name ="test";
    int amount = 1000;

    ReponseDto dto = new ReponseDto(name,amount);

    @Test
    void test(){
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }

    @Test
    void getName() {

    }

    @Test
    void getAmount() {
    }
}