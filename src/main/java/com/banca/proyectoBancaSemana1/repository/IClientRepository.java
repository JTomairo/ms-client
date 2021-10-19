package com.banca.proyectoBancaSemana1.repository;

import com.banca.proyectoBancaSemana1.model.Client;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface IClientRepository extends ReactiveMongoRepository<Client, Integer> {
}
