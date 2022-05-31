package com.supermercado.backend.services.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.supermercado.backend.entities.CarritoComprasCabecera;
import com.supermercado.backend.repositories.ICarritoComprasCabeceraRepository;
import com.supermercado.backend.services.interfaces.ICarritoComprasCabeceraService;

@Service

public class CarritoComprasCabeceraService  implements ICarritoComprasCabeceraService {
	
	@Autowired
	ICarritoComprasCabeceraRepository dao;

	@Override
	@Transactional
	public void save(com.supermercado.backend.entities.CarritoComprasCabecera a) {
		dao.save(a);
		
	}

	@Override
	@Transactional(readOnly=true)
	public Optional<com.supermercado.backend.entities.CarritoComprasCabecera> findById(Integer id) {
		return dao.findById(id);
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		dao.deleteById(id);
		
	}

	

	@Override
	@Transactional(readOnly=true)
	public boolean existsById(Integer id) {
		return dao.existsById(id);
	}

	@Override
	@Transactional(readOnly=true) 
	public List<CarritoComprasCabecera> list() {
		return (List<CarritoComprasCabecera>) dao.findAll();
	}




}
