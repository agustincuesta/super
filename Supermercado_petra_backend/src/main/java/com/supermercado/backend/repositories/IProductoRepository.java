package com.supermercado.backend.repositories;

import org.springframework.data.repository.CrudRepository;

import com.supermercado.backend.entities.Producto;

public interface IProductoRepository extends CrudRepository <Producto,Integer>{

}
