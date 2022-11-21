package com.crud.http.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="suministra")//en caso que la tabala sea diferente
public class Suministra {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	
	@ManyToOne
    @JoinColumn(name = "codigopieza")
	Pieza piezas;
	
	@ManyToOne
    @JoinColumn(name = "idproveedor")
	Proveedores proveedores;
	

	@Column(name = "precio")
	private int precio;


	public Suministra() {
		
	}


	public Suministra(int id, Pieza piezas, Proveedores proveedores, int precio) {
		super();
		this.id = id;
		this.piezas = piezas;
		this.proveedores = proveedores;
		this.precio = precio;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Pieza getPiezas() {
		return piezas;
	}


	public void setPiezas(Pieza piezas) {
		this.piezas = piezas;
	}


	public Proveedores getProveedores() {
		return proveedores;
	}


	public void setProveedores(Proveedores proveedores) {
		this.proveedores = proveedores;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Suministra [id=" + id + ", piezas=" + piezas + ", proveedores=" + proveedores + ", precio=" + precio
				+ "]";
	}


	
	
	
	
	
	
}
