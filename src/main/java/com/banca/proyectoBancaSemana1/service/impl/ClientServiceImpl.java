package com.banca.proyectoBancaSemana1.service.impl;

import com.banca.proyectoBancaSemana1.model.Client;
import com.banca.proyectoBancaSemana1.repository.IClientRepository;
import com.banca.proyectoBancaSemana1.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClientServiceImpl implements IClientService {

    @Autowired
    private IClientRepository clientRepository;

    @Override
    public Flux<Client> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public Mono<Client> save(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Mono<Client> update(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Mono<Void> deleteById(Integer id) {
        return clientRepository.deleteById(id);
    }

}
