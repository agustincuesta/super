package com.supermercado.backend.services.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supermercado.backend.entities.ProveedorContacto;
import com.supermercado.backend.repositories.IProveedorContactoRepository;
import com.supermercado.backend.services.interfaces.IProveedorContactoService;

@Service
public class ProveedorContactoService implements IProveedorContactoService {

	
	@Autowired
	IProveedorContactoRepository dao;
	@Override
	public void save(ProveedorContacto a) {
		dao.save(a);
		
	}

	@Override
	public Optional<ProveedorContacto> findById(Integer id) {
		return dao.findById(id);
	}

	@Override
	public void delete(Integer id) {
		dao.deleteById(id);
		
	}

	@Override
	public List<ProveedorContacto> list() {
		return (List<ProveedorContacto>) dao.findAll();
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return dao.existsById(id);
	}

}
