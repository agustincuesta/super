package com.supermercado.backend.services.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supermercado.backend.entities.Producto;
import com.supermercado.backend.repositories.IProductoRepository;
import com.supermercado.backend.services.interfaces.IProductoService;

@Service
public class ProductoService implements IProductoService{

	
	@Autowired
	IProductoRepository dao;
	@Override
	public void save(Producto a) {
		dao.save(a);
		
	}

	@Override
	public Optional<Producto> findById(Integer id) {
		return dao.findById(id);
	}

	@Override
	public void delete(Integer id) {
		dao.deleteById(id);
		
	}

	@Override
	public List<Producto> list() {
		
		return (List<Producto>) dao.findAll();
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return dao.existsById(id);
	}

}
