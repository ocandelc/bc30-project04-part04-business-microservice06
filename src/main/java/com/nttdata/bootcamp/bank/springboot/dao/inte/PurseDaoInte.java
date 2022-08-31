package com.nttdata.bootcamp.bank.springboot.dao.inte;

import com.nttdata.bootcamp.bank.springboot.document.Purse;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface PurseDaoInte extends ReactiveMongoRepository<Purse, String> {
    Mono<Purse> readByCodePurse(String codePurse);
}
