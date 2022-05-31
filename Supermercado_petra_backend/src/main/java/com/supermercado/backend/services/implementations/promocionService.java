package com.supermercado.backend.services.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supermercado.backend.entities.promocion;
import com.supermercado.backend.repositories.IpromocionRepository;
import com.supermercado.backend.services.interfaces.IpromocionService;

@Service
public class promocionService  implements IpromocionService{

	
	@Autowired
	IpromocionRepository dao;
	@Override
	public void save(promocion a) {
		dao.save(a);
		
	}

	@Override
	public Optional<promocion> findById(Integer id) {
		return dao.findById(id);
	}

	@Override
	public void delete(Integer id) {
		dao.deleteById(id);
		
	}

	@Override
	public List<promocion> list() {
		
		return (List<promocion>) dao.findAll();
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return dao.existsById(id);
	}

}
