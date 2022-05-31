package com.supermercado.backend.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Direccionn")
public class Direccion {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY )
	@Basic(optional=false)
	
	@Column(name="id_direccion")
	private Integer idDireccion;
	@Column(name="codigo")
	private long codigo;
	@Column(name="codigoPostal")
    private String codigoPostal;
	@Column(name="calleSecundaria")
    private String calleSecundaria;
	@Column(name="numeracion")
    private String numeracion;
	@Column(name="referencia")
    private String referencia;
	
	
	
	
	public Direccion() {
		super();
	}
	public Direccion(Integer idDireccion) {
		super();
		this.idDireccion = idDireccion;
	}
	public Integer getIdDireccion() {
		return idDireccion;
	}
	public void setIdDireccion(Integer idDireccion) {
		this.idDireccion = idDireccion;
	}
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public String getCalleSecundaria() {
		return calleSecundaria;
	}
	public void setCalleSecundaria(String calleSecundaria) {
		this.calleSecundaria = calleSecundaria;
	}
	public String getNumeracion() {
		return numeracion;
	}
	public void setNumeracion(String numeracion) {
		this.numeracion = numeracion;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	
	
}
