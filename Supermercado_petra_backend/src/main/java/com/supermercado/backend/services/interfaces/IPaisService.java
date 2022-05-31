package com.supermercado.backend.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.supermercado.backend.entities.Pais;

public interface IPaisService {
	void save(Pais a);
	Optional <Pais> findById(Integer id);
	void delete (Integer id);
	List <Pais> list();
	boolean existsById(Integer id);

}
