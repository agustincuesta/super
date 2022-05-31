package com.supermercado.backend.repositories;

import org.springframework.data.repository.CrudRepository;

import com.supermercado.backend.entities.Cliente;

public interface IClienteRepository extends CrudRepository <Cliente,Integer> {

}
