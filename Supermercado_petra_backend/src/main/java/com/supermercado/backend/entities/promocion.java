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
@Table(name="Promocionn")
public class promocion {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY )
	@Basic(optional=false)
	
	@Column(name="id_promocion")
	private Integer id_Promocion;
	
	@Column(name="codigo")
	private long codigo;
	@Column(name="diaPromocion")
    private GregorianCalendar diaPromocion;
	@Column(name="descuento")
    private double descuento;
	
	
	
	
	public promocion() {
		super();
	}
	public promocion(Integer id_Promocion) {
		super();
		this.id_Promocion = id_Promocion;
	}
	public Integer getId_Promocion() {
		return id_Promocion;
	}
	public void setId_Promocion(Integer id_Promocion) {
		this.id_Promocion = id_Promocion;
	}
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public GregorianCalendar getDiaPromocion() {
		return diaPromocion;
	}
	public void setDiaPromocion(GregorianCalendar diaPromocion) {
		this.diaPromocion = diaPromocion;
	}
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
	
	

}
