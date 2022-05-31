package com.supermercado.backend.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="UnidadMedidaa")
public class UnidadMedida {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY )
	@Basic(optional=false)
	
	@Column(name="id_unidadMedida")
	private Integer idUnidadMedida;
	@Column(name="codigo")
	private long codigo;
	@Column(name="nombre")
    private String nombre;
	
	
	public UnidadMedida() {
		super();
	}
	public UnidadMedida(Integer idUnidadMedida) {
		super();
		this.idUnidadMedida = idUnidadMedida;
	}
	public Integer getIdUnidadMedida() {
		return idUnidadMedida;
	}
	public void setIdUnidadMedida(Integer idUnidadMedida) {
		this.idUnidadMedida = idUnidadMedida;
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
