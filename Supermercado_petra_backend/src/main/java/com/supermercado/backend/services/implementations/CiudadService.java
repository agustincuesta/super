package com.supermercado.backend.services.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.supermercado.backend.entities.Ciudad;
import com.supermercado.backend.repositories.ICiudadRepository;
import com.supermercado.backend.services.interfaces.ICiudadService;

@Service
public class CiudadService implements ICiudadService {

	
	@Autowired
	ICiudadRepository dao;
	
	
	@Override
	@Transactional
	public void save(Ciudad a) {
		dao.save(a);
		
	}

	@Override
	@Transactional(readOnly=true)
	public Optional<Ciudad> findById(Integer id) {
		return dao.findById(id);
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		dao.deleteById(id);
		
	}

	@Override
	@Transactional(readOnly=true)
	public List<Ciudad> list() {
		return (List<Ciudad>) dao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return dao.existsById(id);
	}

}
