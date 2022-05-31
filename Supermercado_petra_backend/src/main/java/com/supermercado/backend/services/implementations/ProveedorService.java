package com.supermercado.backend.services.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supermercado.backend.entities.Proveedor;
import com.supermercado.backend.repositories.IProveedorRepository;
import com.supermercado.backend.services.interfaces.IProveedorService;

@Service
public class ProveedorService implements  IProveedorService{

	
	@Autowired
	IProveedorRepository dao;
	@Override
	public void save(Proveedor a) {
		dao.save(a);
		
	}

	@Override
	public Optional<Proveedor> findById(Integer id) {
		return dao.findById(id);
	}

	@Override
	public void delete(Integer id) {
		dao.deleteById(id);
		
	}

	@Override
	public List<Proveedor> list() {
		return (List<Proveedor>) dao.findAll();
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return dao.existsById(id);
	}

}
