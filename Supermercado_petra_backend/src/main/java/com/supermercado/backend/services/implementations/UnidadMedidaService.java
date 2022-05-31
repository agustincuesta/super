package com.supermercado.backend.services.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supermercado.backend.entities.UnidadMedida;
import com.supermercado.backend.repositories.IUnidadMedidaRepository;
import com.supermercado.backend.services.interfaces.IUnidadMedidaService;

@Service
public class UnidadMedidaService implements IUnidadMedidaService {

	
	@Autowired
	IUnidadMedidaRepository dao;
	@Override
	public void save(UnidadMedida a) {
		dao.save(a);
		
	}

	@Override
	public Optional<UnidadMedida> findById(Integer id) {
		return dao.findById(id);
	}

	@Override
	public void delete(Integer id) {
		dao.deleteById(id);
		
	}

	@Override
	public List<UnidadMedida> list() {
		return (List<UnidadMedida>) dao.findAll();
	}

	@Override
	public boolean existsById(Integer id) {
		return dao.existsById(id);
	}

}
