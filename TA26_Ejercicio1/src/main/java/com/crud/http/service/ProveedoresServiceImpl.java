package com.crud.http.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.http.dao.IProveedoresDAO;
import com.crud.http.dto.Proveedores;



@Service
public class ProveedoresServiceImpl implements IProveedoresService {

	
	//Utilizamos los metodos de la interface IClienteDAO, es como si instaciaramos.
	@Autowired
	IProveedoresDAO iProveedoresDAO;
		
	@Override
	public List<Proveedores> listarProveedores() {
		// TODO Auto-generated method stub
		return iProveedoresDAO.findAll();
	}

	@Override
	public Proveedores guardarProveedores(Proveedores proveedores) {
		// TODO Auto-generated method stub
		return iProveedoresDAO.save(proveedores);
	}

	@Override
	public Proveedores proveedoresXID(String id) {
		// TODO Auto-generated method stub
		return iProveedoresDAO.findById(id).get();
	}

	@Override
	public List<Proveedores> listarProveedoresNombre(String nombre) {
		// TODO Auto-generated method stub
		return iProveedoresDAO.findByNombre(nombre);
	}

	@Override
	public Proveedores actualizarProveedores(Proveedores proveedores) {
		// TODO Auto-generated method stub
		return iProveedoresDAO.save(proveedores);
	}

	@Override
	public void eliminarProveedores(String id) {
		// TODO Auto-generated method stub
		iProveedoresDAO.deleteById(id);
	}

}
