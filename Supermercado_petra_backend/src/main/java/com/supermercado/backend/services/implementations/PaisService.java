package com.supermercado.backend.services.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supermercado.backend.entities.Pais;
import com.supermercado.backend.repositories.IPaisRepository;
import com.supermercado.backend.services.interfaces.IPaisService;

@Service
public class PaisService implements IPaisService {

	
	@Autowired
	IPaisRepository dao;
	@Override
	public void save(Pais a) {
		dao.save(a);
		
	}

	@Override
	public Optional<Pais> findById(Integer id) {
		return dao.findById(id);
	}

	@Override
	public void delete(Integer id) {
		dao.deleteById(id);
		
	}

	@Override
	public List<Pais> list() {
		return (List<Pais>) dao.findAll();
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return dao.existsById(id);
	}

}
