package com.supermercado.backend.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.supermercado.backend.entities.Ciudad;

public interface ICiudadService {
	void save(Ciudad a);
	Optional <Ciudad> findById(Integer id);
	void delete (Integer id);
	List <Ciudad> list();
	boolean existsById(Integer id);
	

}
