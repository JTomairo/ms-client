package com.banca.proyectoBancaSemana1.controller;

import com.banca.proyectoBancaSemana1.model.Client;
import com.banca.proyectoBancaSemana1.repository.IClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ClientController {
    @Autowired
    private IClientRepository clientRepository;

    @GetMapping("/listClients")
    public Flux<Client> listClients(){
        return Flux.fromIterable(clientRepository.findAll());
    }

    @PostMapping("/addClient")
    public void createClient(@RequestBody Client client) {
        clientRepository.save(client);
    }

    @PutMapping("/updateClient")
    public Mono<Client> updateClient(@RequestBody Client client) {
        return Mono.just(clientRepository.save(client));
    }

    @DeleteMapping("/deleteClient/{id}")
    public void deleteClient(@PathVariable("id") Integer id) {
        clientRepository.deleteById(id);
    }

}
