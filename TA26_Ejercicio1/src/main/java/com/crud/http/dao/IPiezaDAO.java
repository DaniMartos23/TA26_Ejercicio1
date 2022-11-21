package com.crud.http.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.http.dto.Pieza;

public interface IPiezaDAO extends JpaRepository<Pieza, Integer> {
	//Listar articulos por campo nombre
			public List<Pieza> findByNombre(String nombre);
}
