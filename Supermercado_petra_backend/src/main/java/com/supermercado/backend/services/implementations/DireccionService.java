package com.supermercado.backend.services.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supermercado.backend.entities.Direccion;
import com.supermercado.backend.repositories.IDireccionRepository;
import com.supermercado.backend.services.interfaces.IDireccionService;

@Service
public class DireccionService implements IDireccionService {

	@Autowired
	IDireccionRepository dao;
	@Override
	public void save(Direccion a) {
		dao.save(a);
		
	}

	@Override
	public Optional<Direccion> findById(Integer id) {
		return dao.findById(id);
	}

	@Override
	public void delete(Integer id) {
		dao.deleteById(id);
		
	}

	@Override
	public List<Direccion> list() {
		return (List<Direccion>) dao.findAll();
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return dao.existsById(id);
	}

}
