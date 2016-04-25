package com.mit.entity;

// Generated 25 avr. 2016 17:35:48 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Attestation generated by hbm2java
 */
@Entity
@Table(name = "attestation", catalog = "mitdb")
public class Attestation implements java.io.Serializable {

	private Integer idAttestation;
	private Tache tache;
	private Membre membre;
	private Date dateAttestation;
	private String descAttestation;

	public Attestation() {
	}

	public Attestation(Tache tache, Membre membre) {
		this.tache = tache;
		this.membre = membre;
	}

	public Attestation(Tache tache, Membre membre, Date dateAttestation,
			String descAttestation) {
		this.tache = tache;
		this.membre = membre;
		this.dateAttestation = dateAttestation;
		this.descAttestation = descAttestation;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idAttestation", unique = true, nullable = false)
	public Integer getIdAttestation() {
		return this.idAttestation;
	}

	public void setIdAttestation(Integer idAttestation) {
		this.idAttestation = idAttestation;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "idProjet", referencedColumnName = "idProjet", nullable = false),
			@JoinColumn(name = "idTache", referencedColumnName = "idTache", nullable = false) })
	public Tache getTache() {
		return this.tache;
	}

	public void setTache(Tache tache) {
		this.tache = tache;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idMembre", nullable = false)
	public Membre getMembre() {
		return this.membre;
	}

	public void setMembre(Membre membre) {
		this.membre = membre;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dateAttestation", length = 19)
	public Date getDateAttestation() {
		return this.dateAttestation;
	}

	public void setDateAttestation(Date dateAttestation) {
		this.dateAttestation = dateAttestation;
	}

	@Column(name = "descAttestation", length = 254)
	public String getDescAttestation() {
		return this.descAttestation;
	}

	public void setDescAttestation(String descAttestation) {
		this.descAttestation = descAttestation;
	}

}
