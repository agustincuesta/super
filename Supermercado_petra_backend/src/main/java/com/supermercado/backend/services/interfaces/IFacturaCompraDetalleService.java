package com.supermercado.backend.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.supermercado.backend.entities.FacturaCompraDetalle;

public interface IFacturaCompraDetalleService {
	void save(FacturaCompraDetalle a);
	Optional <FacturaCompraDetalle> findById(Integer id);
	void delete (Integer id);
	List <FacturaCompraDetalle> list();
	boolean existsById(Integer id);

}
