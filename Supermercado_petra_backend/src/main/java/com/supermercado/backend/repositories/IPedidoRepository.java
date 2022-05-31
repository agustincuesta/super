package com.supermercado.backend.repositories;

import org.springframework.data.repository.CrudRepository;

import com.supermercado.backend.entities.Pedido;

public interface IPedidoRepository extends CrudRepository <Pedido,Integer>  {

}
