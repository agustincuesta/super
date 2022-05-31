package com.supermercado.backend.services.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supermercado.backend.entities.FacturaCompraCabecera;
import com.supermercado.backend.repositories.IFacturaCompraCabeceraRepository;
import com.supermercado.backend.services.interfaces.IFacturaCompraCabeceraService;

@Service
public class FacturaCompraCabeceraService implements IFacturaCompraCabeceraService{

	
	@Autowired
	IFacturaCompraCabeceraRepository dao;
	@Override
	public void save(FacturaCompraCabecera a) {
		dao.save(a);
		
	}

	@Override
	public Optional<FacturaCompraCabecera> findById(Integer id) {
		return dao.findById(id);
	}

	@Override
	public void delete(Integer id) {
		dao.deleteById(id);
		
	}

	@Override
	public List<FacturaCompraCabecera> list() {
		return (List<FacturaCompraCabecera>) dao.findAll();
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return dao.existsById(id);
	}

}
