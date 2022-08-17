package com.example.demo.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="cientificos")
public class Cientifico {
	@Id
	private String dni;
	@Column
	private String nomapels;
	
	@OneToMany
	@JoinColumn(name = "cientifico")
	private List<AsignadoA> asignadoA;

	public Cientifico() {
	}
	public Cientifico(String dni, String nomapels, List<AsignadoA> asignadoA) {
		this.dni = dni;
		this.nomapels = nomapels;
		this.asignadoA = asignadoA;
	}
	public String getDni() {
		return dni;
	}
	public String getNomapels() {
		return nomapels;
	}
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "AsignadoA")
	public List<AsignadoA> getAsignadoA() {
		return asignadoA;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public void setNomapels(String nomapels) {
		this.nomapels = nomapels;
	}
	public void setAsignadoA(List<AsignadoA> asignadoA) {
		this.asignadoA = asignadoA;
	}
	@Override
	public String toString() {
		return "Cientifico [dni=" + dni + ", nomapels=" + nomapels + ", asignadoA=" + asignadoA + "]";
	}

	
}
