package com.supermercado.backend.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.supermercado.backend.entities.Usuario;
import com.supermercado.backend.services.implementations.UsuarioService;

@RestController
@RequestMapping("/usuarioo")
public class UsuarioController {
	
	//Inyectar el servicio
			@Autowired
			UsuarioService service;
				
			//CRUD - L
			//Create
			@PostMapping("/create")
			public ResponseEntity<?> create(@RequestBody Usuario  g) {
				try {
					service.save(g);
					return ResponseEntity.status(HttpStatus.CREATED).body(g);
				}
				catch(Exception ex) {
					return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
				}
			}
			
			
			//Retrieve

			@GetMapping("/retrieve/{id}")
			public ResponseEntity<?> retrieve(@PathVariable Integer id) {
				try {
					Optional<Usuario> g = service.findById(id);
					if(g.isEmpty()) {
						return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario no encontrada");
					}
					return ResponseEntity.ok(g);
				}
				catch(Exception ex) {
					return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
				}		
			}
			
			//Update

			@PutMapping("/update/{id}")
			public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody Usuario  g) {
				try {
					g.setIdUsuario(id);
					service.save(g);
					return ResponseEntity.ok(g);
				}
				catch(Exception ex) {
					return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
				}
			}
			
			
			@DeleteMapping("/delete/{id}")
			public ResponseEntity<?> update(@PathVariable Integer id) {
				try {
					Optional<Usuario> g = service.findById(id);
					if(g.isEmpty()) {
						return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario no encontrada");
					}
					service.delete(id);
					return ResponseEntity.status(HttpStatus.ACCEPTED).body(g);
				}
				catch(Exception ex) {
					return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
				}
			}
			
			
			//List

			@GetMapping("/list")
			public ResponseEntity<?> list() {
				try {
					List<Usuario> vars = service.list();
					if(vars.isEmpty()) {
						return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No hay xxxxxxxxxxxx registradas");
					}
					return ResponseEntity.ok(vars);
				}
				catch(Exception ex) {
					return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
				}		
			}
			
			
			
			
		}


