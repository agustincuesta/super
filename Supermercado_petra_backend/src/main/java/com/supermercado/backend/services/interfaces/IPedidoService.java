package com.supermercado.backend.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.supermercado.backend.entities.Pedido;

public interface IPedidoService {
	void save(Pedido a);
	Optional <Pedido> findById(Integer id);
	void delete (Integer id);
	List <Pedido> list();
	boolean existsById(Integer id);

}
