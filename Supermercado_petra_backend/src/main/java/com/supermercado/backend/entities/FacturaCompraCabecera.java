package com.supermercado.backend.entities;

import java.util.GregorianCalendar;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FacturaCompraCabeceraa")
public class FacturaCompraCabecera {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY )
	@Basic(optional=false)
	
	
	@Column(name="id_facturaCompraCabecera")
	private Integer idFacturaCompraCabecera;
	@Column(name="codigo")
	private long codigo;
	@Column(name="fecha")
    private GregorianCalendar fecha;
	@Column(name="SubTotalConiva")
    private double SubTotalConiva;
	@Column(name="SubTotalSiniva")
    private double SubTotalSiniva;
	@Column(name="descuento")
    private double descuento;
	@Column(name="iva")
    private double iva;
	@Column(name="total")
    private double total;
	
	
	
	
	public FacturaCompraCabecera() {
		super();
	}
	public FacturaCompraCabecera(Integer idFacturaCompraCabecera) {
		super();
		this.idFacturaCompraCabecera = idFacturaCompraCabecera;
	}
	public Integer getIdFacturaCompraCabecera() {
		return idFacturaCompraCabecera;
	}
	public void setIdFacturaCompraCabecera(Integer idFacturaCompraCabecera) {
		this.idFacturaCompraCabecera = idFacturaCompraCabecera;
	}
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public GregorianCalendar getFecha() {
		return fecha;
	}
	public void setFecha(GregorianCalendar fecha) {
		this.fecha = fecha;
	}
	public double getSubTotalConiva() {
		return SubTotalConiva;
	}
	public void setSubTotalConiva(double subTotalConiva) {
		SubTotalConiva = subTotalConiva;
	}
	public double getSubTotalSiniva() {
		return SubTotalSiniva;
	}
	public void setSubTotalSiniva(double subTotalSiniva) {
		SubTotalSiniva = subTotalSiniva;
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
	
	
	

}
