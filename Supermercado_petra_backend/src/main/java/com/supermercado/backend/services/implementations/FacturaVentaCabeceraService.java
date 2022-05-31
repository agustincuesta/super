package com.supermercado.backend.services.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supermercado.backend.entities.FacturaVentaCabecera;
import com.supermercado.backend.repositories.IFacturaVentaCabeceraRepository;
import com.supermercado.backend.services.interfaces.IFacturaVentaCabeceraService;

@Service
public class FacturaVentaCabeceraService implements  IFacturaVentaCabeceraService{

	
	@Autowired
	IFacturaVentaCabeceraRepository dao;
	@Override
	public void save(FacturaVentaCabecera a) {
		dao.save(a);
		
	}

	@Override
	public Optional<FacturaVentaCabecera> findById(Integer id) {
		return dao.findById(id);
	}

	@Override
	public void delete(Integer id) {
		dao.deleteById(id);
		
	}

	@Override
	public List<FacturaVentaCabecera> list() {
		return (List<FacturaVentaCabecera>) dao.findAll();
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return dao.existsById(id);
	}

}
