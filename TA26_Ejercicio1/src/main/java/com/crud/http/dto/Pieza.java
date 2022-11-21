package com.crud.http.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="piezas")//en caso que la tabala sea diferente
public class Pieza {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde codigo final de db
	private int codigo;
	
	@Column(name = "nombre")
	private String nombre;
	
	@OneToMany()
    @JoinColumn(name = "codigopieza")
    List<Suministra> suministra;
	
	public Pieza() {
		
	}
	
	
	
	public Pieza(int codigo, String nombre, List<Suministra> suministra) {
		//super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.suministra = suministra;
	}



	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "piezas")
	public List<Suministra> getSuministra() {
		return suministra;
	}
	
	
	public void setSuministra(List<Suministra> suministra) {
		this.suministra = suministra;
	}



	@Override
	public String toString() {
		return "Pieza [codigo=" + codigo + ", nombre=" + nombre +  "]";
	}

	
	
}
