package com.supermercado.backend.repositories;

import org.springframework.data.repository.CrudRepository;

import com.supermercado.backend.entities.Ciudad;

public interface ICiudadRepository extends CrudRepository <Ciudad,Integer>{

}
