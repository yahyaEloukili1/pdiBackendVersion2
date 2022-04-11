package com.dsic.pdi.entities;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Statut {

	@Id
	@GeneratedValue
	private int id;
	private String statut;
	private String statut_ar;
	
	@OneToMany(mappedBy = "projet",cascade = CascadeType.ALL)
	private Collection<Projet> projet;
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
	
	
}
