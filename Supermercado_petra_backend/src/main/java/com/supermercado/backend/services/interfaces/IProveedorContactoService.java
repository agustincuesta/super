package com.supermercado.backend.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.supermercado.backend.entities.ProveedorContacto;

public interface IProveedorContactoService {
	void save(ProveedorContacto a);
	Optional <ProveedorContacto> findById(Integer id);
	void delete (Integer id);
	List <ProveedorContacto> list();
	boolean existsById(Integer id);

}
