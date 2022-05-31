package com.supermercado.backend.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="carritocompras")
public class CarritoComprasDetalle {
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY )
	@Basic(optional=false)
	
	@Column(name="id_carritoCompras")
	private Integer idCarritoCompras;
	@Column(name="codigo")
	private long codigo;
	@Column(name="cantidad")
    private int cantidad;
	@Column(name="precioUnitario")
    private double precioUnitario;
	@Column(name="descuento")
    private double descuento;
	@Column(name="subtotal")
    private double subtotal;
	
	
	public CarritoComprasDetalle() {
		super();
	}
	public CarritoComprasDetalle(Integer idCarritoCompras) {
		super();
		this.idCarritoCompras = idCarritoCompras;
	}
	public Integer getIdCarritoCompras() {
		return idCarritoCompras;
	}
	public void setIdCarritoCompras(Integer idCarritoCompras) {
		this.idCarritoCompras = idCarritoCompras;
	}
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	

	

}
