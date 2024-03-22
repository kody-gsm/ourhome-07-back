package com.example.dto;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

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