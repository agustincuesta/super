package com.supermercado.backend.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.supermercado.backend.entities.Cliente;

public interface IClienteService {
	void save(Cliente a);
	Optional <Cliente> findById(Integer id);
	void delete (Integer id);
	List <Cliente> list();
	boolean existsById(Integer id);
}
