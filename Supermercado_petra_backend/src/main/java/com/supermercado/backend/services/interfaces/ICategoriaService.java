package com.supermercado.backend.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.supermercado.backend.entities.Categoria;

public interface ICategoriaService {
	void save(Categoria a);
	Optional <Categoria> findById(Integer id);
	void delete (Integer id);
	List <Categoria> list();
	boolean existsById(Integer id);

}
