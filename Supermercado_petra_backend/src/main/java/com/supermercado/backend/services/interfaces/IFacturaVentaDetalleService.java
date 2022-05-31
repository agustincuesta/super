package com.supermercado.backend.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.supermercado.backend.entities.FacturaVentaDetalle;

public interface IFacturaVentaDetalleService {
	void save(FacturaVentaDetalle a);
	Optional <FacturaVentaDetalle> findById(Integer id);
	void delete (Integer id);
	List <FacturaVentaDetalle> list();
	boolean existsById(Integer id);

}
