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

import com.supermercado.backend.entities.CarritoComprasDetalle;
import com.supermercado.backend.services.implementations.CarritoComprasDetalleService;


@RestController
@RequestMapping("/carritocompras")
public class CarritoComprasDetalleController {
	
	//Inyectar el servicio
	@Autowired
	CarritoComprasDetalleService service;
	
	//CRUD - L
			//Create
			@PostMapping("/create")
			public ResponseEntity<?> create(@RequestBody CarritoComprasDetalle  b) {
				try {
					service.save(b);
					return ResponseEntity.status(HttpStatus.CREATED).body(b);
				}
				catch(Exception ex) {
					return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
				}
			}
			
			//Retrieve

			@GetMapping("/retrieve/{id}")
			public ResponseEntity<?> retrieve(@PathVariable Integer id) {
				try {
					Optional<CarritoComprasDetalle> b = service.findById(id);
					if(b.isEmpty()) {
						return ResponseEntity.status(HttpStatus.NOT_FOUND).body("CarritoComprasDetalle no encontrada");
					}
					return ResponseEntity.ok(b);
				}
				catch(Exception ex) {
					return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
				}		
			}
			//Update

			@PutMapping("/update/{id}")
			public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody CarritoComprasDetalle b) {
				try {
					b.setIdCarritoCompras(id);
					service.save(b);
					return ResponseEntity.ok(b);
				}
				catch(Exception ex) {
					return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
				}
			}
			
			
			@DeleteMapping("/delete/{id}")
			public ResponseEntity<?> update(@PathVariable Integer id) {
				try {
					Optional<CarritoComprasDetalle> b = service.findById(id);
					if(b.isEmpty()) {
						return ResponseEntity.status(HttpStatus.NOT_FOUND).body("CarritoComprasDetalle no encontrada");
					}
					service.delete(id);
					return ResponseEntity.status(HttpStatus.ACCEPTED).body(b);
				}
				catch(Exception ex) {
					return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
				}
			}
			
			
			//List

			@GetMapping("/list")
			public ResponseEntity<?> list() {
				try {
					List<CarritoComprasDetalle> vars = service.list();
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
	