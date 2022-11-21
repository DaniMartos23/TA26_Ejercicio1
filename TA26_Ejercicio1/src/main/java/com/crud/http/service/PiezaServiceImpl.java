package com.crud.http.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.http.dao.IPiezaDAO;
import com.crud.http.dto.Pieza;


@Service
public class PiezaServiceImpl implements IPiezaService{
	//Utilizamos los metodos de la interface IClienteDAO, es como si instaciaramos.
	@Autowired
	IPiezaDAO iPiezasDAO;
	
	@Override
	public List<Pieza> listarPiezas() {
		// TODO Auto-generated method stub
		return iPiezasDAO.findAll();
	}

	@Override
	public Pieza guardarPieza(Pieza pieza) {
		// TODO Auto-generated method stub
		return iPiezasDAO.save(pieza);
	}

	@Override
	public Pieza piezaXID(int id) {
		// TODO Auto-generated method stub
		return iPiezasDAO.findById(id).get();
	}

	@Override
	public List<Pieza> listarPiezaNombre(String nombre) {
		// TODO Auto-generated method stub
		return iPiezasDAO.findByNombre(nombre);
	}

	@Override
	public Pieza actualizarPieza(Pieza pieza) {
		// TODO Auto-generated method stub
		return iPiezasDAO.save(pieza);
	}

	@Override
	public void eliminarPieza(int id) {
		
		iPiezasDAO.deleteById(id);
		
	}
	
	

}
