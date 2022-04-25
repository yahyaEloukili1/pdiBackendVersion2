package com.dsic.pdi.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Partenaire {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String partenaire;
	private int contribution;
	@ManyToMany(mappedBy = "partenaires")
	private List<Projet> projets;
	
	public Partenaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Partenaire(String partenaire, int contribution) {
		super();
		this.partenaire = partenaire;
		this.contribution = contribution;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPartenaireTitle() {
		return partenaire;
	}
	public void setPartenaireTitle(String partenaire) {
		this.partenaire = partenaire;
	}
	public int getContribution() {
		return contribution;
	}
	public void setContribution(int contribution) {
		this.contribution = contribution;
	}
	public List<Projet> getProjets() {
		return projets;
	}
	public void setProjets(List<Projet> projets) {
		this.projets = projets;
	}
	
	
	
	
	
	
}
