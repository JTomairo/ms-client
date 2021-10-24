package com.banca.proyectoBancaSemana1.controller;

import com.banca.proyectoBancaSemana1.model.Client;
import com.banca.proyectoBancaSemana1.service.impl.ClientServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
public class ClientController {

    @Autowired
    private ClientServiceImpl clientService;

    @GetMapping("/listClients")
    public Flux<Client> listClients() {
        return clientService.findAll();
    }

    @PostMapping("/addClient")
    public void createClient(@RequestBody Client client) {
        clientService.save(client).subscribe();
    }

    @PutMapping("/updateClient")
    public Mono<Client> updateClient(@RequestBody Client client) {
        return clientService.update(client);
    }

    @DeleteMapping("/deleteClient/{id}")
    public Mono<Void> deleteClient(@PathVariable("id") String id) {
        return clientService.deleteById(id);
    }

}
