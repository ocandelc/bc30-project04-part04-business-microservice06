package com.nttdata.bootcamp.bank.springboot.controller;

import com.nttdata.bootcamp.bank.springboot.document.Purse;
import com.nttdata.bootcamp.bank.springboot.service.inte.PurseServiceInte;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/business-microservice06-purse/purse")
public class PurseRestController {

    private static final Logger log = LoggerFactory.getLogger(PurseServiceInte.class);

    @Autowired
    private PurseServiceInte purseServiceInte;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Mono<Purse> create(@RequestBody final Purse purse) {
        log.debug("Begin RestController create Purse");
        return purseServiceInte.create(purse);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Flux<Purse> readAll() {
        log.debug("Begin RestController readAll Purse");
        return purseServiceInte.readAll();
    }

    @RequestMapping(value = "/readByCodePurse/{codePurse}", method = RequestMethod.GET)
    public Mono<Purse> readByCodePurse(@PathVariable String codePurse) {
        log.debug("Begin RestController readByCodePurse Purse");
        return purseServiceInte.readByCodePurse(codePurse);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Mono<Purse> updateById(@RequestBody final Purse purse, @PathVariable("id") final String id) {
        log.debug("Begin RestController updateById Purse");
        return purseServiceInte.updateById(purse, id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Mono<Void> deleteById(@PathVariable final String id) {
        log.debug("Begin RestController deleteById Purse");
        return purseServiceInte.deleteById(id);
    }

}