package com.supermercado.backend.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.supermercado.backend.entities.Provincia;

public interface IProvinciaService {
	void save(Provincia a);
	Optional <Provincia> findById(Integer id);
	void delete (Integer id);
	List <Provincia> list();
	boolean existsById(Integer id);

}
