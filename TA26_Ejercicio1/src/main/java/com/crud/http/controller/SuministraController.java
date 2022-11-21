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

import com.crud.http.dto.Suministra;
import com.crud.http.service.SuministraServiceImpl;

@RestController
@RequestMapping("/api")

public class SuministraController {

	@Autowired
	SuministraServiceImpl suministraServiceImpl;
	
	@GetMapping("/suministra")
	public List<Suministra> listarSuministras(){
		return suministraServiceImpl.listarSuministra();
	}
	
	
	
	
	@PostMapping("/suministra")
	public Suministra salvarSuministra( @RequestBody Suministra suministra) {
		return suministraServiceImpl.guardarSuministra(suministra);
	}
	
	
	@GetMapping("/suministra/{codigo}")
	public Suministra SuministraXID(@PathVariable(name="codigo") int id) {
		
		Suministra suministra_xid= new Suministra();
		
		suministra_xid= suministraServiceImpl.suministraXID(id);
		
		System.out.println("Suministra XID: "+suministra_xid);
		
		return suministra_xid;
	}
	
	@PutMapping("/suministra/{codigo}")
	public Suministra actualizarSuministra(@PathVariable(name="codigo")int id, @RequestBody Suministra suministra) {
		
		Suministra suministra_seleccionado= new Suministra();
		Suministra suministra_actualizado= new Suministra();
		
		suministra_seleccionado= suministraServiceImpl.suministraXID(id);
		suministra_seleccionado.setPrecio(suministra.getPrecio());
		suministra_seleccionado.setProveedores(suministra.getProveedores());
		suministra_seleccionado.setPiezas(suministra.getPiezas());
		suministra_actualizado = suministraServiceImpl.actualizarSuministra(suministra_seleccionado);
		
		System.out.println("El Suministra actualizado es: "+ suministra_actualizado);
		
		return suministra_actualizado;
	}
	
	@DeleteMapping("/suministra/{codigo}")
	public void eliminarSuministra(@PathVariable(name="codigo")int id) {
		suministraServiceImpl.eliminarSuministra(id);
	}
}
