package com.supermercado.backend.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.supermercado.backend.entities.FacturaCompraCabecera;

public interface IFacturaCompraCabeceraService {
	void save(FacturaCompraCabecera a);
	Optional <FacturaCompraCabecera> findById(Integer id);
	void delete (Integer id);
	List <FacturaCompraCabecera> list();
	boolean existsById(Integer id);

}
