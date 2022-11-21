package com.crud.http.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.http.dto.Suministra;

public interface ISuministraDAO extends JpaRepository<Suministra, Integer> {
	
}
