package com.supermercado.backend.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.supermercado.backend.entities.Proveedor;

public interface IProveedorService {
	void save(Proveedor a);
	Optional <Proveedor> findById(Integer id);
	void delete (Integer id);
	List <Proveedor> list();
	boolean existsById(Integer id);

}
