package com.supermercado.backend.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.supermercado.backend.entities.Direccion;

public interface IDireccionService {
	void save(Direccion a);
	Optional <Direccion> findById(Integer id);
	void delete (Integer id);
	List <Direccion> list();
	boolean existsById(Integer id);

}
