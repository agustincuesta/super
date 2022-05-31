package com.supermercado.backend.services.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.supermercado.backend.entities.CarritoComprasDetalle;
import com.supermercado.backend.repositories.ICarritoComprasDetalleRepository;
import com.supermercado.backend.services.interfaces.ICarritoComprasDetalleService;

@Service
public class CarritoComprasDetalleService implements ICarritoComprasDetalleService {

	
	@Autowired
	ICarritoComprasDetalleRepository dao;
	
	@Override
	@Transactional
	public void save(com.supermercado.backend.entities.CarritoComprasDetalle a) {
		dao.save(a);
		
	}

	@Override
	@Transactional(readOnly=true)
	public Optional<com.supermercado.backend.entities.CarritoComprasDetalle> findById(Integer id) {
		return dao.findById(id);
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		dao.deleteById(id);
		
	}

	@Override
	@Transactional(readOnly=true)
	public List<com.supermercado.backend.entities.CarritoComprasDetalle> list() {
		return (List<CarritoComprasDetalle>) dao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public boolean existsById(Integer id) {
		return dao.existsById(id);
	}

}
