package com.supermercado.backend.services.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supermercado.backend.entities.FacturaVentaDetalle;
import com.supermercado.backend.repositories.IFacturaVentaDetalleRepository;
import com.supermercado.backend.services.interfaces.IFacturaVentaDetalleService;

@Service
public class FacturaVentaDetalleService implements  IFacturaVentaDetalleService{

	
	@Autowired
	IFacturaVentaDetalleRepository dao;
	@Override
	public void save(FacturaVentaDetalle a) {
		dao.save(a);
		
	}

	@Override
	public Optional<FacturaVentaDetalle> findById(Integer id) {
		return dao.findById(id);
	}

	@Override
	public void delete(Integer id) {
		dao.deleteById(id);
		
	}

	@Override
	public List<FacturaVentaDetalle> list() {
		
		return (List<FacturaVentaDetalle>) dao.findAll();
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return dao.existsById(id);
	}

}
