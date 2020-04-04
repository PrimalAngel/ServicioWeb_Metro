package com.metro.dto;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Compra")
public class Compra {
	
	String compra;
	String typeVagon;
	String typePago;
	String fecha;
	
	public String getCompra() {
		return compra;
	}
	public void setCompra(String compra) {
		this.compra = compra;
	}
	public String getTypeVagon() {
		return typeVagon;
	}
	public void setTypeVagon(String typeVagon) {
		this.typeVagon = typeVagon;
	}
	public String getTypePago() {
		return typePago;
	}
	public void setTypePago(String typePago) {
		this.typePago = typePago;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
}
