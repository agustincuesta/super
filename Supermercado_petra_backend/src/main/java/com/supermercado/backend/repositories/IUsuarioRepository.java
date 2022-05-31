package com.supermercado.backend.repositories;

import org.springframework.data.repository.CrudRepository;

import com.supermercado.backend.entities.Usuario;

public interface IUsuarioRepository extends CrudRepository <Usuario,Integer>{

}
