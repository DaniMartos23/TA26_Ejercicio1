package com.crud.http.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.http.dto.Proveedores;

public interface IProveedoresDAO extends JpaRepository<Proveedores, String> {
	
	//Listar fabricantes por campo nombre
		public List<Proveedores> findByNombre(String nombre);
}
