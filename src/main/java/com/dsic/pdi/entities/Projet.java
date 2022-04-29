package com.dsic.pdi.entities;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.data.rest.core.annotation.RestResource;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Projet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String projet;
	private String projet_ar;
	private String location;
	private Long cout;
	private int delai;
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dateLancement;
	
	@ManyToOne
	 @JoinColumn(name="province_id")
	private Province province;
	@ManyToOne
	 @JoinColumn(name="statut_id")
	@RestResource
	private Statut statut;
	
	@ManyToOne
	 @JoinColumn(name="situation_id")
	@RestResource
	private SituationEtude situationEtude;
	
	@ManyToOne
	 @JoinColumn(name="taux_id")
	@RestResource
	private TauxAvancement tauxAvancement;
	

	private String consistence;
	private String benificiares;
	@ManyToOne
	 @JoinColumn(name="maitreOuvrage_id")
	private MaitreOuvrage maitreOuvrage;
	@ManyToOne
	 @JoinColumn(name="axe_id")
	private Axe axe;
	
	@ManyToOne
	 @JoinColumn(name="secteur_id")
	private Secteur secteur;
	@ManyToOne
	 @JoinColumn(name="commune_id")
	private Commune commune;
	
	private String maitreOuvrageDélegue;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Partenaire> partenaires;
	
	@Lob
	private String partenaireContribution; 
	@Lob
	private String benificiaires; 
	

	public Projet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Projet(String projet, String projet_ar, String location, Long cout, int delai, Date dateLancement,
			Statut statut, String consistence, String benificiares, Axe axe, String maitreOuvrageDélegue) {
		super();
		this.projet = projet;
		this.projet_ar = projet_ar;
		this.location = location;
		this.cout = cout;
		this.delai = delai;
		this.dateLancement = dateLancement;
		this.statut = statut;
		this.consistence = consistence;
		this.benificiares = benificiares;
		this.axe = axe;
		this.maitreOuvrageDélegue = maitreOuvrageDélegue;
	}
	
	public Province getProvince() {
		return province;
	}
	public void setProvince(Province province) {
		this.province = province;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public List<Partenaire> getPartenaires() {
		return partenaires;
	}
	public void setPartenaires(List<Partenaire> partenaires) {
		this.partenaires = partenaires;
	}
	public String getPartenaireContribution() {
		return partenaireContribution;
	}
	public void setPartenaireContribution(String partenaireContribution) {
		this.partenaireContribution = partenaireContribution;
	}
	public String getBenificiaires() {
		return benificiaires;
	}
	public void setBenificiaires(String benificiaires) {
		this.benificiaires = benificiaires;
	}

	
	public TauxAvancement getTauxAvancement() {
		return tauxAvancement;
	}
	public void setTauxAvancement(TauxAvancement tauxAvancement) {
		this.tauxAvancement = tauxAvancement;
	}
	public SituationEtude getSituationEtude() {
		return situationEtude;
	}
	public void setSituationEtude(SituationEtude situationEtude) {
		this.situationEtude = situationEtude;
	}
	public Secteur getSecteur() {
		return secteur;
	}
	public void setSecteur(Secteur secteur) {
		this.secteur = secteur;
	}
	
	
	
	
	
}
