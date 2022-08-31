package com.nttdata.bootcamp.bank.springboot.service.inte;

import com.nttdata.bootcamp.bank.springboot.document.Purse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PurseServiceInte {

    Mono<Purse> create(final Purse purse);

    Flux<Purse> readAll();

    Mono<Purse> readByCodePurse(String codePurse);

    Mono<Purse> updateById(final Purse purse, final String id);

    Mono<Void> deleteById(final String id);
}