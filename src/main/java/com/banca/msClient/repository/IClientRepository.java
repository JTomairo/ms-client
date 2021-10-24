package com.banca.msClient.repository;

import com.banca.msClient.model.Client;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClientRepository extends ReactiveMongoRepository<Client, String> {
}
