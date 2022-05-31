package com.supermercado.backend.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Categiriaa")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY )
	@Basic(optional=false)
	
	@Column(name="id_categoria")
	private Integer idCategoria;
	@Column(name="codigo")
	 private long codigo;
	@Column(name="nombre")
	
	
	 private String nombre;
	public Categoria(Integer idCategoria) {
		super();
		this.idCategoria = idCategoria;
	}

	public Categoria() {
		super();
	}
	
	public Integer getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
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
