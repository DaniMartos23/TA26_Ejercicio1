package com.crud.http.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.http.dao.ISuministraDAO;
import com.crud.http.dto.Suministra;


@Service
public class SuministraServiceImpl implements ISuministraService{
	
	@Autowired
	ISuministraDAO iSuministrasDAO;
	
	@Override
	public List<Suministra> listarSuministra() {
		// TODO Auto-generated method stub
		return iSuministrasDAO.findAll();
	}

	@Override
	public Suministra guardarSuministra(Suministra suministra) {
		// TODO Auto-generated method stub
		return iSuministrasDAO.save(suministra);
	}

	@Override
	public Suministra suministraXID(int id) {
		// TODO Auto-generated method stub
		return iSuministrasDAO.findById(id).get();
	}

	

	@Override
	public Suministra actualizarSuministra(Suministra suministra) {
		// TODO Auto-generated method stub
		return iSuministrasDAO.save(suministra);
	}

	@Override
	public void eliminarSuministra(int id) {
		
		iSuministrasDAO.deleteById(id);
		
	}
	
	

}
