package com.supermercado.backend.services.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supermercado.backend.entities.Usuario;
import com.supermercado.backend.repositories.IUsuarioRepository;
import com.supermercado.backend.services.interfaces.IUsuarioService;

@Service
public class UsuarioService implements IUsuarioService {

	
	@Autowired
	IUsuarioRepository dao;
	@Override
	public void save(Usuario a) {
		dao.save(a);
		
	}

	@Override
	public Optional<Usuario> findById(Integer id) {
		return dao.findById(id);
	}

	@Override
	public void delete(Integer id) {
		dao.deleteById(id);
		
	}

	@Override
	public List<Usuario> list() {
		return (List<Usuario>) dao.findAll();
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return dao.existsById(id);
	}

}
