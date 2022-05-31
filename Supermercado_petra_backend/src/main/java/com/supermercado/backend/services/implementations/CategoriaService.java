package com.supermercado.backend.services.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.supermercado.backend.entities.Categoria;
import com.supermercado.backend.repositories.ICategoriaRepository;
import com.supermercado.backend.services.interfaces.ICategoriaService;

@Service
public class CategoriaService implements  ICategoriaService{

	@Autowired
	ICategoriaRepository dao;
	
	
	@Override
	@Transactional
	public void save(com.supermercado.backend.entities.Categoria a) {
		dao.save(a);
		
	}

	@Override
	@Transactional(readOnly=true)
	public Optional<com.supermercado.backend.entities.Categoria> findById(Integer id) {
		return dao.findById(id);
	}

	@Override
	public void delete(Integer id) {
		dao.deleteById(id);
		
	}

	@Override
	@Transactional(readOnly=true)
	public List<com.supermercado.backend.entities.Categoria> list() {
		return (List<Categoria>) dao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return dao.existsById(id);
	}

}
