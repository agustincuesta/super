package com.supermercado.backend.services.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supermercado.backend.entities.Pedido;
import com.supermercado.backend.repositories.IPedidoRepository;
import com.supermercado.backend.services.interfaces.IPedidoService;

@Service
public class PedidoService implements IPedidoService  {

	
	@Autowired
	IPedidoRepository dao;
	@Override
	public void save(Pedido a) {
		dao.save(a);
		
	}

	@Override
	public Optional<Pedido> findById(Integer id) {
		return dao.findById(id);
	}

	@Override
	public void delete(Integer id) {
		dao.deleteById(id);
		
	}

	@Override
	public List<Pedido> list() {
		return (List<Pedido>) dao.findAll();
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return dao.existsById(id);
	}

}
