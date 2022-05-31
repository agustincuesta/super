package com.supermercado.backend.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.supermercado.backend.entities.UnidadMedida;

public interface IUnidadMedidaService {
	void save(UnidadMedida a);
	Optional <UnidadMedida> findById(Integer id);
	void delete (Integer id);
	List <UnidadMedida> list();
	boolean existsById(Integer id);

}
