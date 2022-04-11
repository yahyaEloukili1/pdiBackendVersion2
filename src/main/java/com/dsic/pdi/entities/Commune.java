package com.dsic.pdi.entities;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.lang.Nullable;



@Entity
public class Commune {

	@Id
	@GeneratedValue
	private int id;
	
	private String commune;
	private String commune_ar;
	
	@ManyToOne
	 @JoinColumn(name="province_id")
	private Province province;
	
	@OneToMany(mappedBy = "projet",cascade = CascadeType.ALL)
	private Collection<Projet> projet;

	
	public Commune() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Commune(String commune_fr, String commune_ar, Province province) {
		super();
		this.commune = commune_fr;
		this.commune_ar = commune_ar;
		this.province = province;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getCommune() {
		return commune;
	}


	public void setCommune(String commune) {
		this.commune = commune;
	}


	public String getCommune_ar() {
		return commune_ar;
	}


	public void setCommune_ar(String commune_ar) {
		this.commune_ar = commune_ar;
	}


	public Province getProvince() {
		return province;
	}


	public void setProvince(Province province) {
		this.province = province;
	}

	
	
}
