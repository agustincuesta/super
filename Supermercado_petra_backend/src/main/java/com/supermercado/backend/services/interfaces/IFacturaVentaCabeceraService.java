package com.supermercado.backend.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.supermercado.backend.entities.FacturaVentaCabecera;

public interface IFacturaVentaCabeceraService {
	void save(FacturaVentaCabecera a);
	Optional <FacturaVentaCabecera> findById(Integer id);
	void delete (Integer id);
	List <FacturaVentaCabecera> list();
	boolean existsById(Integer id);

}
