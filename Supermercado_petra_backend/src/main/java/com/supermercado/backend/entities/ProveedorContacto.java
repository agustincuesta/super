package com.supermercado.backend.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ProveedorContactoo")
public class ProveedorContacto {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY )
	@Basic(optional=false)
	
	
	@Column(name="id_proveedorContacto")
	private Integer idProveedorContacto;
	@Column(name="codigo")
	private long codigo;
	@Column(name="nombre")
    private String nombre;
	@Column(name="telefono")
    private String telefono;
	@Column(name="correoElectronico")
    private String correoElectronico;
	
	
	
	public ProveedorContacto() {
		super();
	}
	public ProveedorContacto(Integer idProveedorContacto) {
		super();
		this.idProveedorContacto = idProveedorContacto;
	}
	public Integer getIdProveedorContacto() {
		return idProveedorContacto;
	}
	public void setIdProveedorContacto(Integer idProveedorContacto) {
		this.idProveedorContacto = idProveedorContacto;
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
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	
	

}
