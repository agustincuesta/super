package com.supermercado.backend.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.supermercado.backend.entities.CarritoComprasDetalle;

public interface ICarritoComprasDetalleService {
	void save (CarritoComprasDetalle a);
	Optional<CarritoComprasDetalle> findById(Integer id);
	void delete (Integer id);
	List<CarritoComprasDetalle> list();
	boolean existsById(Integer id);
	

}
