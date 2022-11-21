package com.crud.http.service;

import java.util.List;

import com.crud.http.dto.Suministra;

public interface ISuministraService {
	//Metodos del CRUD
	public List<Suministra> listarSuministra(); //Listar All 
	
	public Suministra guardarSuministra(Suministra suministra);	//Guarda un suministra CREATE
	
	public Suministra suministraXID(int id); //Leer datos de un suministra READ
			
	
			
	public Suministra actualizarSuministra(Suministra suministra); //Actualiza datos del suministra UPDATE
			
	public void eliminarSuministra(int id);// Elimina el suministra DELETE
}
