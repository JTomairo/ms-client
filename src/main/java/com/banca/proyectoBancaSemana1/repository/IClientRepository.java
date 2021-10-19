package com.banca.proyectoBancaSemana1.repository;

import com.banca.proyectoBancaSemana1.model.Client;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IClientRepository extends MongoRepository<Client, Integer> {
}
