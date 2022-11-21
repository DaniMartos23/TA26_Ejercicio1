package com.crud.http.service;

import java.util.List;

import com.crud.http.dto.Proveedores;

public interface IProveedoresService {
	//Metodos del CRUD
		public List<Proveedores> listarProveedores(); //Listar All 
		
		public Proveedores guardarProveedores(Proveedores proveedores);	//Guarda un fabricante CREATE
		
		public Proveedores proveedoresXID(String id); //Leer datos de un fabricante READ
		
		public List<Proveedores> listarProveedoresNombre(String nombre);//Listar Proveedoress por campo nombre
		
		public Proveedores actualizarProveedores(Proveedores proveedores); //Actualiza datos del fabricante UPDATE
		
		public void eliminarProveedores(String id);// Elimina el fabricante DELETE
}
