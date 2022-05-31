package com.supermercado.backend.services.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.supermercado.backend.entities.Cliente;
import com.supermercado.backend.repositories.IClienteRepository;
import com.supermercado.backend.services.interfaces.IClienteService;

@Service
public class ClienteService implements IClienteService {

	
	@Autowired
	IClienteRepository dao;
	
	
	@Override
	@Transactional
	public void save(Cliente a) {
		dao.save(a);
		
	}

	@Override
	@Transactional(readOnly=true)
	public Optional<Cliente> findById(Integer id) {
		return dao.findById(id);
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		dao.deleteById(id);
		
	}

	@Override
	@Transactional(readOnly=true)
	public List<Cliente> list() {
		
		return (List<Cliente>) dao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return dao.existsById(id);
	}

}
