package com.crud.http.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.http.dto.Usuario;


public interface IUsuarioDAO extends JpaRepository<Usuario, Long> {
	//Listar articulos por campo username
			Usuario findByUsername(String username);
}
