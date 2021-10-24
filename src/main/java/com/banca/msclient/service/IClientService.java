package com.banca.msclient.service;

import com.banca.msclient.model.Client;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IClientService {
    public Flux<Client> findAll();
    public Mono<Client> findById(String id);
    public Mono<Client> save(Client client);
    public Mono<Client> update(Client client);
    public Mono<Void> deleteById(String id);
}
