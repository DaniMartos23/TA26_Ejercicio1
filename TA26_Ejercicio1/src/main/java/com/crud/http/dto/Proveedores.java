package com.crud.http.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name="proveedores")//en caso que la tabala sea diferente
public class Proveedores {
	
	@Id
	@Column(name="id")
	private String id;
	@Column(name = "nombre")
	private String nombre;

	@OneToMany
    @JoinColumn(name="idproveedor")
    private List<Suministra> suministra;
	
	public Proveedores() {
		
	}
	
	public Proveedores(String id, String nombre,List<Suministra> suministra) {
		//super();
		this.id = id;
		this.nombre = nombre;
		this.suministra= suministra;
	}

	/**
	 * @return codigo
	 */
	
	public String getCodigo() {
		return id;
	}
	
	/**
	 * 
	 * @param codigo
	 */

	public void setCodigo(String id) {
		this.id = id;
	}
	
	/**
	 * @return nombre
	 */

	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	/**
	 * 
	 * @return suministra
	 */
	
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "proveedores")
	public List<Suministra> getSuministra() {
		return suministra;
	}
	
	/**
	 * 
	 * @param suministra
	 */
	
	public void setSuministra(List<Suministra> suministra) {
		this.suministra = suministra;
	}

	@Override
	public String toString() {
		return "Proveedores [id=" + id + ", nombre=" + nombre +  "]";
	}
	
	
	
}
