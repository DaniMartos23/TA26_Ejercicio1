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

import com.crud.http.dto.Proveedores;
import com.crud.http.service.ProveedoresServiceImpl;


@RestController
@RequestMapping("/api")

public class ProveedoresController {
	@Autowired
	ProveedoresServiceImpl proveedoresServiceImpl;
	
	@GetMapping("/proveedores")
	public List<Proveedores> listarProveedores(){
		return proveedoresServiceImpl.listarProveedores();
	}
	
	//listar proveedoress por campo nombre
	@GetMapping("/proveedores/nombre/{nombre}")
	public List<Proveedores> listarProveedoresNombre(@PathVariable(name="nombre") String nombre) {
	    return proveedoresServiceImpl.listarProveedoresNombre(nombre);
	}
	
	
	@PostMapping("/proveedores")
	public Proveedores salvarProveedores(@RequestBody Proveedores proveedores) {
		return proveedoresServiceImpl.guardarProveedores(proveedores);
	}
	
	
	@GetMapping("/proveedores/{id}")
	public Proveedores ProveedoresXID(@PathVariable(name="id") String id) {
		
		Proveedores proveedores_xid= new Proveedores();
		
		proveedores_xid= proveedoresServiceImpl.proveedoresXID(id);
		
		System.out.println("Proveedores XID: "+proveedores_xid);
		
		return proveedores_xid;
	}
	
	@PutMapping("/proveedores/{id}")
	public Proveedores actualizarProveedores(@PathVariable(name="id")String id, @RequestBody Proveedores proveedores) {
		
		Proveedores proveedores_seleccionado= new Proveedores();
		Proveedores proveedores_actualizado= new Proveedores();
		
		proveedores_seleccionado= proveedoresServiceImpl.proveedoresXID(id);
		
		proveedores_seleccionado.setNombre(proveedores.getNombre());
		proveedores_actualizado = proveedoresServiceImpl.actualizarProveedores(proveedores_seleccionado);
		
		System.out.println("El Proveedores actualizado es: "+ proveedores_actualizado);
		
		return proveedores_actualizado;
	}
	
	@DeleteMapping("/proveedores/{id}")
	public void eliminarProveedores(@PathVariable(name="id")String id) {
		proveedoresServiceImpl.eliminarProveedores(id);
	}
}
