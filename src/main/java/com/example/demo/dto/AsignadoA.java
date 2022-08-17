package com.example.demo.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="asignado_a")
public class AsignadoA {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;

	@ManyToOne
    @JoinColumn(name = "cientifico")
    Cientifico cientifico;
 
    @ManyToOne
    @JoinColumn(name = "proyecto")
    Proyecto proyecto;

	public AsignadoA(int id, Cientifico cientifico, Proyecto proyecto) {
		this.id = id;
		this.cientifico = cientifico;
		this.proyecto = proyecto;
	}
	public AsignadoA() {
	}
	public int getId() {
		return id;
	}
	public Cientifico getCientifico() {
		return cientifico;
	}
	public Proyecto getProyecto() {
		return proyecto;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setCientifico(Cientifico cientifico) {
		this.cientifico = cientifico;
	}
	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}
	@Override
	public String toString() {
		return "AsignadoA [id=" + id + ", cientifico=" + cientifico + ", proyecto=" + proyecto + "]";
	}
    
    

}
