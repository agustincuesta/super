package com.supermercado.backend.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productoo")
public class Producto {
	

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY )
	@Basic(optional=false)
	
	@Column(name="id_producto")
	private Integer idProducto; 
	@Column(name="codigo")
	private  String codigo;
	@Column(name="imagenUrl")
	private String imagenUrl;
	@Column(name="nombre")
	private String nombre;
	@Column(name="descripcion")
	private String descripcion ;
	@Column(name="precio")
	private Double precio;
	@Column(name="stockAnual")
	private int stockAnual;
	@Column(name="descuento")
	private Double descuento;
	
	
	public Producto() {
		super();
	}
	public Producto(Integer idproducto) {
		super();
		this.idProducto = idproducto;
	}
	public Integer getIdproducto() {
		return idProducto;
	}
	public void setIdproducto(Integer idproducto) {
		this.idProducto = idproducto;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getImagenUrl() {
		return imagenUrl;
	}
	public void setImagenUrl(String imagenUrl) {
		this.imagenUrl = imagenUrl;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public int getStockAnual() {
		return stockAnual;
	}
	public void setStockAnual(int stockAnual) {
		this.stockAnual = stockAnual;
	}
	public Double getDescuento() {
		return descuento;
	}
	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}
	
	

}
