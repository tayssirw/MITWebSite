package com.mit.entity;

// Generated 30 avr. 2016 14:36:04 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Tache generated by hbm2java
 */
@Entity
@Table(name = "tache", catalog = "mitdb")
public class Tache implements java.io.Serializable {

	private Integer idTache;
	private Projet projet;
	private String nomTache;
	private String descTache;
	private Date dateD;
	private Date dateF;
	private Boolean etatTache;
	private Set<Contrat> contrats = new HashSet<Contrat>(0);
	private Set<Tachemembre> tachemembres = new HashSet<Tachemembre>(0);

	public Tache() {
	}

	public Tache(Projet projet) {
		this.projet = projet;
	}

	public Tache(Projet projet, String nomTache, String descTache, Date dateD,
			Date dateF, Boolean etatTache, Set<Contrat> contrats,
			Set<Tachemembre> tachemembres) {
		this.projet = projet;
		this.nomTache = nomTache;
		this.descTache = descTache;
		this.dateD = dateD;
		this.dateF = dateF;
		this.etatTache = etatTache;
		this.contrats = contrats;
		this.tachemembres = tachemembres;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idTache", unique = true, nullable = false)
	public Integer getIdTache() {
		return this.idTache;
	}

	public void setIdTache(Integer idTache) {
		this.idTache = idTache;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idProjet", nullable = false)
	public Projet getProjet() {
		return this.projet;
	}

	public void setProjet(Projet projet) {
		this.projet = projet;
	}

	@Column(name = "nomTache", length = 254)
	public String getNomTache() {
		return this.nomTache;
	}

	public void setNomTache(String nomTache) {
		this.nomTache = nomTache;
	}

	@Column(name = "descTache", length = 254)
	public String getDescTache() {
		return this.descTache;
	}

	public void setDescTache(String descTache) {
		this.descTache = descTache;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dateD", length = 10)
	public Date getDateD() {
		return this.dateD;
	}

	public void setDateD(Date dateD) {
		this.dateD = dateD;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dateF", length = 10)
	public Date getDateF() {
		return this.dateF;
	}

	public void setDateF(Date dateF) {
		this.dateF = dateF;
	}

	@Column(name = "etatTache")
	public Boolean getEtatTache() {
		return this.etatTache;
	}

	public void setEtatTache(Boolean etatTache) {
		this.etatTache = etatTache;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tache")
	public Set<Contrat> getContrats() {
		return this.contrats;
	}

	public void setContrats(Set<Contrat> contrats) {
		this.contrats = contrats;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tache")
	public Set<Tachemembre> getTachemembres() {
		return this.tachemembres;
	}

	public void setTachemembres(Set<Tachemembre> tachemembres) {
		this.tachemembres = tachemembres;
	}

}
