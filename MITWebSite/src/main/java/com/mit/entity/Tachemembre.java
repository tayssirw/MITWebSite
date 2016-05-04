package com.mit.entity;

// Generated 30 avr. 2016 14:36:04 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Tachemembre generated by hbm2java
 */
@Entity
@Table(name = "tachemembre", catalog = "mitdb")
public class Tachemembre implements java.io.Serializable {

	private TachemembreId id;
	private Membre membre;
	private Tache tache;
	private String etatTache;

	public Tachemembre() {
	}

	public Tachemembre(TachemembreId id, Membre membre, Tache tache) {
		this.id = id;
		this.membre = membre;
		this.tache = tache;
	}

	public Tachemembre(TachemembreId id, Membre membre, Tache tache,
			String etatTache) {
		this.id = id;
		this.membre = membre;
		this.tache = tache;
		this.etatTache = etatTache;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idTache", column = @Column(name = "idTache", nullable = false)),
			@AttributeOverride(name = "idMembre", column = @Column(name = "idMembre", nullable = false, length = 254)) })
	public TachemembreId getId() {
		return this.id;
	}

	public void setId(TachemembreId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idMembre", nullable = false, insertable = false, updatable = false)
	public Membre getMembre() {
		return this.membre;
	}

	public void setMembre(Membre membre) {
		this.membre = membre;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idTache", nullable = false, insertable = false, updatable = false)
	public Tache getTache() {
		return this.tache;
	}

	public void setTache(Tache tache) {
		this.tache = tache;
	}

	@Column(name = "etatTache", length = 50)
	public String getEtatTache() {
		return this.etatTache;
	}

	public void setEtatTache(String etatTache) {
		this.etatTache = etatTache;
	}

}
