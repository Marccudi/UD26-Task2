package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IAsignadoADAO;
import com.example.demo.dto.AsignadoA;

@Service
public class AsignadoAServiceImpl {
	@Autowired
	IAsignadoADAO AsignadoADAO;
public List<AsignadoA> listarAsignadoAs() {
		
		return AsignadoADAO.findAll();
	}

	
	public AsignadoA guardarAsignadoA(AsignadoA asignadoA) {
		
		return AsignadoADAO.save(asignadoA);
	}

	
	public AsignadoA asignadoAXID(int id) {
		
		return AsignadoADAO.findById(id).get();
	}

	
	public AsignadoA actualizarAsignadoA(AsignadoA asignadoA) {
		
		return AsignadoADAO.save(asignadoA);
	}

	
	public void eliminarAsignadoA(int id) {
		
		AsignadoADAO.deleteById(id);
		
	}
}
