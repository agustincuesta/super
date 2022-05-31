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

import com.supermercado.backend.entities.Provincia;
import com.supermercado.backend.services.implementations.ProvinciaService;

@RestController
@RequestMapping("/provinciaa")
public class ProvinciaController {
	
	//Inyectar el servicio
			@Autowired
			ProvinciaService service;
				
			//CRUD - L
			//Create
			@PostMapping("/create")
			public ResponseEntity<?> create(@RequestBody Provincia i) {
				try {
					service.save(i);
					return ResponseEntity.status(HttpStatus.CREATED).body(i);
				}
				catch(Exception ex) {
					return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
				}
			}
			
			
			//Retrieve

			@GetMapping("/retrieve/{id}")
			public ResponseEntity<?> retrieve(@PathVariable Integer id) {
				try {
					Optional<Provincia> i = service.findById(id);
					if(i.isEmpty()) {
						return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Provincia no encontrada");
					}
					return ResponseEntity.ok(i);
				}
				catch(Exception ex) {
					return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
				}		
			}
			
			//Update

			@PutMapping("/update/{id}")
			public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody Provincia  i) {
				try {
					i.setIdProvincia(id);
					service.save(i);
					return ResponseEntity.ok(i);
				}
				catch(Exception ex) {
					return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
				}
			}
			
			
			@DeleteMapping("/delete/{id}")
			public ResponseEntity<?> update(@PathVariable Integer id) {
				try {
					Optional<Provincia> i = service.findById(id);
					if(i.isEmpty()) {
						return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Provincia no encontrada");
					}
					service.delete(id);
					return ResponseEntity.status(HttpStatus.ACCEPTED).body(i);
				}
				catch(Exception ex) {
					return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
				}
			}
			
			
			//List

			@GetMapping("/list")
			public ResponseEntity<?> list() {
				try {
					List<Provincia> vars = service.list();
					if(vars.isEmpty()) {
						return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No hay Provincia registradas");
					}
					return ResponseEntity.ok(vars);
				}
				catch(Exception ex) {
					return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
				}		
			}
			
			
			
			
		}


