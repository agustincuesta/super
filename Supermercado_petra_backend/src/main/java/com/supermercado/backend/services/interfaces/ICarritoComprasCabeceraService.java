package com.supermercado.backend.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.supermercado.backend.entities.CarritoComprasCabecera;

public interface ICarritoComprasCabeceraService {
	
	void save(CarritoComprasCabecera a);
	Optional<CarritoComprasCabecera> findById(Integer id);
	void delete(Integer id);
	List <CarritoComprasCabecera> list();
	boolean existsById(Integer id);
	
	
	

}
