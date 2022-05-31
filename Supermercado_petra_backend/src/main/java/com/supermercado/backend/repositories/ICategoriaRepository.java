package com.supermercado.backend.repositories;

import org.springframework.data.repository.CrudRepository;
import com.supermercado.backend.entities.Categoria;

public interface ICategoriaRepository extends CrudRepository <Categoria,Integer>{

}
