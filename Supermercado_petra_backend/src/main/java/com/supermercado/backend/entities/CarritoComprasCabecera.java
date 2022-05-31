package com.supermercado.backend.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Carritoo")
public class CarritoComprasCabecera {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY )
	@Basic(optional=false)
	
	@Column(name="id_carrito")
	private Integer idCarrito;
	@Column(name="codigo")
	private long codigo;
	@Column(name="subTotalConiva")
    private double subTotalConiva;
	@Column(name="subTotalSiniva")
    private double subTotalSiniva;
	@Column(name="descuento")
    private double descuento;
	@Column(name="iva")
    private double iva;
	@Column(name="total")
    private double total;
    
    
    
	public CarritoComprasCabecera(Integer idCarrito) {
		super();
		this.idCarrito = idCarrito;
	}


	public CarritoComprasCabecera() {
		super();
	}
	
	
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public double getSubTotalConiva() {
		return subTotalConiva;
	}
	public void setSubTotalConiva(double subTotalConiva) {
		this.subTotalConiva = subTotalConiva;
	}
	public double getSubTotalSiniva() {
		return subTotalSiniva;
	}
	public void setSubTotalSiniva(double subTotalSiniva) {
		this.subTotalSiniva = subTotalSiniva;
	}
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	public double getIva() {
		return iva;
	}
	public void setIva(double iva) {
		this.iva = iva;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}


	public Integer getIdCarrito() {
		return idCarrito;
	}


	public void setIdCarrito(Integer idCarrito) {
		this.idCarrito = idCarrito;
	}


	public void setId_carritoComprasCabecera(Integer id) {
		// TODO Auto-generated method stub
		
	}
    
    

}
