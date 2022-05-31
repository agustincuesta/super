package com.supermercado.backend.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.supermercado.backend.entities.Producto;

public interface IProductoService {
	void save(Producto a);
	Optional <Producto> findById(Integer id);
	void delete (Integer id);
	List <Producto> list();
	boolean existsById(Integer id);

}
