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

import com.supermercado.backend.entities.Pais;
import com.supermercado.backend.services.implementations.PaisService;

@RestController
@RequestMapping("/paiss")
public class PaisController {
	
	//Inyectar el servicio
			@Autowired
			PaisService service;
				
			//CRUD - L
			//Create
			@PostMapping("/create")
			public ResponseEntity<?> create(@RequestBody Pais r) {
				try {
					service.save(r);
					return ResponseEntity.status(HttpStatus.CREATED).body(r);
				}
				catch(Exception ex) {
					return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
				}
			}
			
			
			//Retrieve

			@GetMapping("/retrieve/{id}")
			public ResponseEntity<?> retrieve(@PathVariable Integer id) {
				try {
					Optional<Pais> r = service.findById(id);
					if(r.isEmpty()) {
						return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Pais no encontrada");
					}
					return ResponseEntity.ok(r);
				}
				catch(Exception ex) {
					return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
				}		
			}
			
			//Update

			@PutMapping("/update/{id}")
			public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody Pais  r) {
				try {
					r.setIdPais(id);
					service.save(r);
					return ResponseEntity.ok(r);
				}
				catch(Exception ex) {
					return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
				}
			}
			
			
			@DeleteMapping("/delete/{id}")
			public ResponseEntity<?> update(@PathVariable Integer id) {
				try {
					Optional<Pais> r = service.findById(id);
					if(r.isEmpty()) {
						return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Pais no encontrada");
					}
					service.delete(id);
					return ResponseEntity.status(HttpStatus.ACCEPTED).body(r);
				}
				catch(Exception ex) {
					return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
				}
			}
			
			
			//List

			@GetMapping("/list")
			public ResponseEntity<?> list() {
				try {
					List<Pais> vars = service.list();
					if(vars.isEmpty()) {
						return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No hay Pais registradas");
					}
					return ResponseEntity.ok(vars);
				}
				catch(Exception ex) {
					return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
				}		
			}

}
