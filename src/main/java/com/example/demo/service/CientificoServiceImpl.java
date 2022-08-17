package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ICientificoDAO;
import com.example.demo.dto.Cientifico;

@Service
public class CientificoServiceImpl {
	@Autowired
	ICientificoDAO CientificoDAO;
public List<Cientifico> listarCientificos() {
		
		return CientificoDAO.findAll();
	}

	
	public Cientifico guardarCientifico(Cientifico cientifico) {
		
		return CientificoDAO.save(cientifico);
	}

	
	public Cientifico cientificoXID(String id) {
		
		return CientificoDAO.findById(id).get();
	}

	
	public Cientifico actualizarCientifico(Cientifico cientifico) {
		
		return CientificoDAO.save(cientifico);
	}

	
	public void eliminarCientifico(String id) {
		
		CientificoDAO.deleteById(id);
		
	}
}
