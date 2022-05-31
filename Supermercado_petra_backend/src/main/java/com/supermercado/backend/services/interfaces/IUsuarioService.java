package com.supermercado.backend.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.supermercado.backend.entities.Usuario;

public interface IUsuarioService {
	void save(Usuario a);
	Optional <Usuario> findById(Integer id);
	void delete (Integer id);
	List <Usuario> list();
	boolean existsById(Integer id);

}
