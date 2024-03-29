package com.dsic.pdi.entities;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Statut {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String statut;
	private String statut_ar;
	
	@OneToMany(mappedBy = "statut")
	private Collection<Projet> projets;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	
	public String getStatut_ar() {
		return statut_ar;
	}
	public void setStatut_ar(String statut_ar) {
		this.statut_ar = statut_ar;
	}
	public Statut() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Statut(String statut, String statut_ar) {
		super();
		this.statut = statut;
		this.statut_ar = statut_ar;
	}
	public Collection<Projet> getProjets() {
		return projets;
	}
	public void setProjets(Collection<Projet> projets) {
		this.projets = projets;
	}
	
	
}
