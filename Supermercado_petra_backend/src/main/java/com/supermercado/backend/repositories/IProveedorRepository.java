package com.supermercado.backend.repositories;

import org.springframework.data.repository.CrudRepository;

import com.supermercado.backend.entities.Proveedor;

public interface IProveedorRepository extends CrudRepository <Proveedor,Integer> {

}
