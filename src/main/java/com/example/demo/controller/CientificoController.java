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

import com.example.demo.dto.Cientifico;
import com.example.demo.service.CientificoServiceImpl;

@RestController
@RequestMapping("/api")
public class CientificoController {

	@Autowired
	CientificoServiceImpl cientificoServiceImpl;
	
	@GetMapping("/cientificos")
	public List<Cientifico> listarCientificos(){
		return cientificoServiceImpl.listarCientificos();
	}
	
	@PostMapping("/cientificos")
	public Cientifico salvarCientifico(@RequestBody Cientifico cientifico) {
		
		return cientificoServiceImpl.guardarCientifico(cientifico);
	}
	
	@GetMapping("/cientificos/{id}")
	public Cientifico cientificoXID(@PathVariable(name="id") String id) {
		
		Cientifico cientifico_xid= new Cientifico();
		
		cientifico_xid=cientificoServiceImpl.cientificoXID(id);
		
		
		return cientifico_xid;
	}
	
	@PutMapping("/cientificos/{id}")
	public Cientifico actualizarCientifico(@PathVariable(name="id")String id,@RequestBody Cientifico cientifico) {
		
		Cientifico cientifico_seleccionado= new Cientifico();
		Cientifico cientifico_actualizado= new Cientifico();
		
		cientifico_seleccionado= cientificoServiceImpl.cientificoXID(id);
		
		cientifico_seleccionado.setNomapels(cientifico.getNomapels());
		
		cientifico_actualizado = cientificoServiceImpl.actualizarCientifico(cientifico_seleccionado);
		
		
		return cientifico_actualizado;
	}
	
	@DeleteMapping("/cientificos/{id}")
	public void eleiminarCientifico(@PathVariable(name="id")String id) {
		cientificoServiceImpl.eliminarCientifico(id);
	}
	
	
}