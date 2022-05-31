package com.supermercado.backend.services.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supermercado.backend.entities.Provincia;
import com.supermercado.backend.repositories.IProvinciaRepository;
import com.supermercado.backend.services.interfaces.IProvinciaService;

@Service
public class ProvinciaService implements IProvinciaService{

	
	@Autowired
	IProvinciaRepository dao;
	@Override
	public void save(Provincia a) {
		dao.save(a);
		
	}

	@Override
	public Optional<Provincia> findById(Integer id) {
		return dao.findById(id);
	}

	@Override
	public void delete(Integer id) {
		dao.deleteById(id);
		
	}

	@Override
	public List<Provincia> list() {
		return (List<Provincia>) dao.findAll();
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return dao.existsById(id);
	}

}
