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

import com.supermercado.backend.entities.Cliente;
import com.supermercado.backend.services.implementations.ClienteService;

@RestController
@RequestMapping("/clientee")
public class ClienteController {

	//Inyectar el servicio
			@Autowired
			ClienteService service;
				
			//CRUD - L
			//Create
			@PostMapping("/create")
			public ResponseEntity<?> create(@RequestBody Cliente  e) {
				try {
					service.save(e);
					return ResponseEntity.status(HttpStatus.CREATED).body(e);
				}
				catch(Exception ex) {
					return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
				}
			}
			
			
			//Retrieve

			@GetMapping("/retrieve/{id}")
			public ResponseEntity<?> retrieve(@PathVariable Integer id) {
				try {
					Optional<Cliente> e = service.findById(id);
					if(e.isEmpty()) {
						return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente no encontrada");
					}
					return ResponseEntity.ok(e);
				}
				catch(Exception ex) {
					return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
				}		
			}
			
			//Update

			@PutMapping("/update/{id}")
			public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody Cliente e) {
				try {
					e.setIdCliente(id);
					service.save(e);
					return ResponseEntity.ok(e);
				}
				catch(Exception ex) {
					return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
				}
			}
			
			
			@DeleteMapping("/delete/{id}")
			public ResponseEntity<?> update(@PathVariable Integer id) {
				try {
					Optional<Cliente> e = service.findById(id);
					if(e.isEmpty()) {
						return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente no encontrada");
					}
					service.delete(id);
					return ResponseEntity.status(HttpStatus.ACCEPTED).body(e);
				}
				catch(Exception ex) {
					return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
				}
			}
			
			
			//List

			@GetMapping("/list")
			public ResponseEntity<?> list() {
				try {
					List<Cliente> vars = service.list();
					if(vars.isEmpty()) {
						return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No hay Clienteregistradas");
					}
					return ResponseEntity.ok(vars);
				}
				catch(Exception ex) {
					return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
				}		
			}
}