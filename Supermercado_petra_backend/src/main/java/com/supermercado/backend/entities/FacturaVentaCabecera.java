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
@Table(name="FacturaVentaCabeceraa")
public class FacturaVentaCabecera {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY )
	@Basic(optional=false)
	
	@Column(name="id_facturaVentaCabecera")
	private Integer idFacturaVentaCabecera;
	
	@Column(name="codigo")
	private long codigo;
	
	@Column(name="fecha")
    private GregorianCalendar fecha;
	
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
	
	
	public FacturaVentaCabecera() {
		super();
	}
	public FacturaVentaCabecera(Integer idFacturaVentaCabecera) {
		super();
		this.idFacturaVentaCabecera = idFacturaVentaCabecera;
	}
	public Integer getIdFacturaVentaCabecera() {
		return idFacturaVentaCabecera;
	}
	public void setIdFacturaVentaCabecera(Integer idFacturaVentaCabecera) {
		this.idFacturaVentaCabecera = idFacturaVentaCabecera;
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
	
	
}