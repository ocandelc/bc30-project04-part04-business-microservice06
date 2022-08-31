package com.nttdata.bootcamp.bank.springboot.service.impl;

import com.nttdata.bootcamp.bank.springboot.dao.inte.PurseDaoInte;
import com.nttdata.bootcamp.bank.springboot.document.Purse;
import com.nttdata.bootcamp.bank.springboot.service.inte.PurseServiceInte;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PurseServiceImpl implements PurseServiceInte {

    private static final Logger log = LoggerFactory.getLogger(PurseServiceInte.class);

    @Autowired
    private PurseDaoInte purseDaoInte;

    @Override
    public Mono<Purse> create(final Purse purse) {

        return purseDaoInte.save(purse)
                .doFirst(() -> log.info("Begin create Purse"))
                .doOnNext(a -> log.info(a.toString()))
                .doAfterTerminate(() -> log.info("Finish create Purse"));
    }

    @Override
    public Flux<Purse> readAll() {

        return purseDaoInte.findAll()
                .doFirst(() -> log.info("Begin readAll Purse"))
                .doOnNext(a -> log.info(a.toString()))
                .doAfterTerminate(() -> log.info("Finish readAll Purse"));
    }

    @Override
    public Mono<Purse> readByCodePurse(String codePurse) {
        return purseDaoInte.readByCodePurse(codePurse)
                .doFirst(() -> log.info("Begin readByCodePurse Purse"))
                .doOnNext(a -> log.info(a.toString()))
                .doAfterTerminate(() -> log.info("Finish readByCodePurse Purse"));
    }

    @Override
    public Mono<Purse> updateById(final Purse purse, final String id) {

        return purseDaoInte.save(purse)
                .doFirst(() -> log.info("Begin updateById Purse"))
                .doOnNext(a -> log.info(a.toString()))
                .doAfterTerminate(() -> log.info("Finish updateById Purse"));
    }

    @Override
    public Mono<Void> deleteById(final String id) {

        return purseDaoInte.deleteById(id)
                .doFirst(() -> log.info("Begin deleteById Purse"))
                .doOnNext(a -> log.info(a.toString()))
                .doAfterTerminate(() -> log.info("Finish deleteById Purse"));
    }

}