package com.dsic.pdi.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Projet {

	@Id
	@GeneratedValue
	private int id;
	
	private String projet;
	private String projet_ar;
	private String location;
	private Long cout;
	private int delai;
	private Date dateLancement;
	
	@ManyToOne
	 @JoinColumn(name="statut_id")
	private Statut statut;
	private String consistence;
	private String benificiares;
	@ManyToOne
	 @JoinColumn(name="maitreOuvrage_id")
	private MaitreOuvrage maitreOuvrage;
	@ManyToOne
	 @JoinColumn(name="axe_id")
	private Axe axe;
	@ManyToOne
	 @JoinColumn(name="commune_id")
	private Commune commune;
	
	private String maitreOuvrageDélegue;

	public Projet(String projet, String projet_ar, String location_ar, Long cout, int delai, Date dateLancement,
			Statut statut, String consistence, String benificiares, MaitreOuvrage maitreOuvrage, Axe axe,
			Commune commune, String maitreOuvrageDélegue) {
		super();
		this.projet = projet;
		this.projet_ar = projet_ar;
		this.location = location_ar;
		this.cout = cout;
		this.delai = delai;
		this.dateLancement = dateLancement;
		this.statut = statut;
		this.consistence = consistence;
		this.benificiares = benificiares;
		this.maitreOuvrage = maitreOuvrage;
		this.axe = axe;
		this.commune = commune;
		this.maitreOuvrageDélegue = maitreOuvrageDélegue;
	}

	public Projet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getProjet() {
		return projet;
	}

	public void setProjet(String projet) {
		this.projet = projet;
	}

	public String getProjet_ar() {
		return projet_ar;
	}

	public void setProjet_ar(String projet_ar) {
		this.projet_ar = projet_ar;
	}

	

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Long getCout() {
		return cout;
	}

	public void setCout(Long cout) {
		this.cout = cout;
	}

	public int getDelai() {
		return delai;
	}

	public void setDelai(int delai) {
		this.delai = delai;
	}

	public Date getDateLancement() {
		return dateLancement;
	}

	public void setDateLancement(Date dateLancement) {
		this.dateLancement = dateLancement;
	}

	public Statut getStatut() {
		return statut;
	}

	public void setStatut(Statut statut) {
		this.statut = statut;
	}

	public String getConsistence() {
		return consistence;
	}

	public void setConsistence(String consistence) {
		this.consistence = consistence;
	}

	public String getBenificiares() {
		return benificiares;
	}

	public void setBenificiares(String benificiares) {
		this.benificiares = benificiares;
	}

	public MaitreOuvrage getMaitreOuvrage() {
		return maitreOuvrage;
	}

	public void setMaitreOuvrage(MaitreOuvrage maitreOuvrage) {
		this.maitreOuvrage = maitreOuvrage;
	}

	public Axe getAxe() {
		return axe;
	}

	public void setAxe(Axe axe) {
		this.axe = axe;
	}

	public Commune getCommune() {
		return commune;
	}

	public void setCommune(Commune commune) {
		this.commune = commune;
	}

	public String getMaitreOuvrageDélegue() {
		return maitreOuvrageDélegue;
	}

	public void setMaitreOuvrageDélegue(String maitreOuvrageDélegue) {
		this.maitreOuvrageDélegue = maitreOuvrageDélegue;
	}
	
	
	
}
