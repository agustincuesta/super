package com.supermercado.backend.services.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supermercado.backend.entities.FacturaCompraDetalle;
import com.supermercado.backend.repositories.IFacturaCompraDetalleRepository;
import com.supermercado.backend.services.interfaces.IFacturaCompraDetalleService;

@Service
public class FacturaCompraDetalleService implements  IFacturaCompraDetalleService{

	
	@Autowired
	IFacturaCompraDetalleRepository dao;
	@Override
	public void save(FacturaCompraDetalle a) {
		dao.save(a);
		
	}

	@Override
	public Optional<FacturaCompraDetalle> findById(Integer id) {
		return dao.findById(id);
	}

	@Override
	public void delete(Integer id) {
		dao.deleteById(id);
		
	}

	@Override
	public List<FacturaCompraDetalle> list() {
		return (List<FacturaCompraDetalle>) dao.findAll();
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return dao.existsById(id);
	}

}
