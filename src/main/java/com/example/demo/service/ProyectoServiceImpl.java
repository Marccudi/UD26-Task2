package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IProyectoDAO;
import com.example.demo.dto.Proyecto;

@Service
public class ProyectoServiceImpl {
	@Autowired
	IProyectoDAO ProyectoDAO;
public List<Proyecto> listarProyectos() {
		
		return ProyectoDAO.findAll();
	}

	
	public Proyecto guardarProyecto(Proyecto proyecto) {
		
		return ProyectoDAO.save(proyecto);
	}

	
	public Proyecto proyectoXID(String id) {
		
		return ProyectoDAO.findById(id).get();
	}

	
	public Proyecto actualizarProyecto(Proyecto proyecto) {
		
		return ProyectoDAO.save(proyecto);
	}

	
	public void eliminarProyecto(String id) {
		
		ProyectoDAO.deleteById(id);
		
	}
}
