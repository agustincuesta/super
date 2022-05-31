package com.supermercado.backend.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.supermercado.backend.entities.promocion;

public interface IpromocionService {
	void save(promocion a);
	Optional <promocion> findById(Integer id);
	void delete (Integer id);
	List <promocion> list();
	boolean existsById(Integer id);

}
