package com.example.demo.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(SpringExtension.class) // Junit과 spring과 연결하는 그런거 ㅇㅇ
@WebMvcTest(controllers = Microcontroller.class) //controlloer과 관련된 것만 선언 가능(service,mapper,domain... 사용 불가)
public class MicrocontrollerTest {
    @Autowired // bean 주입받기
    private MockMvc mvc; //웹 API 테스트시 사용 / MVC 테스트의 시작점 / GET POST 등에 대한 API 테스트 가능
}