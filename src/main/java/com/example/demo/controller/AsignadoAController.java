package com.example.demo.controller;

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

import com.example.demo.dto.AsignadoA;
import com.example.demo.service.AsignadoAServiceImpl;

@RestController
@RequestMapping("/api")
public class AsignadoAController {
	@Autowired
	AsignadoAServiceImpl asignadoAServiceImpl;
	
	@GetMapping("/asignadoa")
	public List<AsignadoA> listarAsignadoAs(){
		return asignadoAServiceImpl.listarAsignadoAs();
	}
	
	@PostMapping("/asignadoa")
	public AsignadoA salvarAsignadoA(@RequestBody AsignadoA asignadoA) {
		
		return asignadoAServiceImpl.guardarAsignadoA(asignadoA);
	}
	
	@GetMapping("/asignadoa/{id}")
	public AsignadoA asignadoAXID(@PathVariable(name="id") int id) {
		
		AsignadoA asignadoA_xid= new AsignadoA();
		
		asignadoA_xid=asignadoAServiceImpl.asignadoAXID(id);
		
		
		return asignadoA_xid;
	}
	
	@PutMapping("/asignadoa/{id}")
	public AsignadoA actualizarAsignadoA(@PathVariable(name="id")int id,@RequestBody AsignadoA asignadoA) {
		
		AsignadoA asignadoA_seleccionado= new AsignadoA();
		AsignadoA asignadoA_actualizado= new AsignadoA();
		
		asignadoA_seleccionado= asignadoAServiceImpl.asignadoAXID(id);
		
		asignadoA_seleccionado.setCientifico(asignadoA.getCientifico());
		asignadoA_seleccionado.setProyecto(asignadoA.getProyecto());
		
		asignadoA_actualizado = asignadoAServiceImpl.actualizarAsignadoA(asignadoA_seleccionado);
		
		
		return asignadoA_actualizado;
	}
	
	@DeleteMapping("/asignadoa/{id}")
	public void eleiminarAsignadoA(@PathVariable(name="id")int id) {
		asignadoAServiceImpl.eliminarAsignadoA(id);
	}
	
	
}
