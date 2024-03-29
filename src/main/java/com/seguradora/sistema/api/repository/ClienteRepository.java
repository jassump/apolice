package com.seguradora.sistema.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.seguradora.sistema.api.documents.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, String> {

}
