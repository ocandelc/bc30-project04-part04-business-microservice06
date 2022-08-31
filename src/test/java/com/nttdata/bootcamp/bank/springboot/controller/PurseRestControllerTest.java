package com.nttdata.bootcamp.bank.springboot.controller;

import com.nttdata.bootcamp.bank.springboot.document.Purse;
import com.nttdata.bootcamp.bank.springboot.service.inte.PurseServiceInte;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import reactor.core.publisher.Flux;

@SpringBootTest
public class PurseRestControllerTest {

    @MockBean
    private PurseServiceInte purseServiceInte;

    @Test
    void readAllTest() {

        Flux<Purse> fluxPurse = purseServiceInte.readAll();

        Mockito.verify(purseServiceInte).readAll();

     }

}
