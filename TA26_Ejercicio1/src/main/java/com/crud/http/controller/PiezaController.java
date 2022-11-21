package com.crud.http.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.http.dto.Pieza;
import com.crud.http.service.PiezaServiceImpl;

@RestController
@RequestMapping("/api")

public class PiezaController {

	@Autowired
	PiezaServiceImpl piezaServiceImpl;
	
	@GetMapping("/piezas")
	public List<Pieza> listarPiezas(){
		return piezaServiceImpl.listarPiezas();
	}
	
	//listar piezas por campo nombre
	@GetMapping("/piezas/nombre/{nombre}")
	public List<Pieza> listarPiezaNombre(@PathVariable(name="nombre") String nombre) {
	    return piezaServiceImpl.listarPiezaNombre(nombre);
	}
	
	
	@PostMapping("/piezas")
	public Pieza salvarPieza( @RequestBody Pieza pieza) {
		return piezaServiceImpl.guardarPieza(pieza);
	}
	
	
	@GetMapping("/piezas/{codigo}")
	public Pieza PiezaXID(@PathVariable(name="codigo") int id) {
		
		Pieza pieza_xid= new Pieza();
		
		pieza_xid= piezaServiceImpl.piezaXID(id);
		
		System.out.println("Pieza XID: "+pieza_xid);
		
		return pieza_xid;
	}
	
	@PutMapping("/piezas/{codigo}")
	public Pieza actualizarPieza(@PathVariable(name="codigo")int id, @RequestBody Pieza pieza) {
		
		Pieza pieza_seleccionado= new Pieza();
		Pieza pieza_actualizado= new Pieza();
		
		pieza_seleccionado= piezaServiceImpl.piezaXID(id);
		
		pieza_seleccionado.setNombre(pieza.getNombre());
		pieza_actualizado = piezaServiceImpl.actualizarPieza(pieza_seleccionado);
		
		System.out.println("El Pieza actualizado es: "+ pieza_actualizado);
		
		return pieza_actualizado;
	}
	
	@DeleteMapping("/piezas/{codigo}")
	public void eliminarPieza(@PathVariable(name="codigo")int id) {
		piezaServiceImpl.eliminarPieza(id);
	}
}
