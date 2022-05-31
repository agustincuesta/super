package com.supermercado.backend.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Ciudadd")
public class Ciudad {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY )
	@Basic(optional=false)
	
	@Column(name="id_ciudad")
	private Integer idCiudad;
	@Column(name="codigo")
	private long codigo;
	@Column(name="nombre")
	
	
	
	
	private String nombre;
	public Ciudad() {
		super();
	}
	public Ciudad(Integer idCiudad) {
		super();
		this.idCiudad = idCiudad;
	}
	public Integer getIdCiudad() {
		return idCiudad;
	}
	public void setIdCiudad(Integer idCiudad) {
		this.idCiudad = idCiudad;
	}
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
