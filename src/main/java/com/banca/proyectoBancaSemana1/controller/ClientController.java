package com.banca.proyectoBancaSemana1.controller;

import com.banca.proyectoBancaSemana1.model.Client;
import com.banca.proyectoBancaSemana1.service.impl.ClientServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@Api(tags = {"REST APIs related to Client Entity"})
public class ClientController {

    @Autowired
    private ClientServiceImpl clientService;

    @ApiOperation(value = "Get list of clients", response = String.class)
    @GetMapping("/listClients")
    public Flux<Client> listClients() {
        return clientService.findAll();
    }

    @ApiOperation(value = "Create client", response = String.class)
    @PostMapping("/addClient")
    public void createClient(@RequestBody Client client) {
        clientService.save(client).subscribe();
    }

    @ApiOperation(value = "Update client", response = String.class)
    @PutMapping("/updateClient")
    public Mono<Client> updateClient(@RequestBody Client client) {
        return clientService.update(client);
    }

    @ApiOperation(value = "Delete a specific client", response = String.class)
    @DeleteMapping("/deleteClient/{id}")
    public Mono<Void> deleteClient(@PathVariable("id") String id) {
        return clientService.deleteById(id);
    }

}
