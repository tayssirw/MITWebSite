package com.mit.entity;

// Generated 20 avr. 2016 13:30:11 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Societe generated by hbm2java
 */
@Entity
@Table(name = "societe", catalog = "mitdb")
public class Societe implements java.io.Serializable {

	private int idSociete;
	private String nomSociete;
	private String adrSociete;
	private String contactSociete;
	private Set<Contratprojet> contratprojets = new HashSet<Contratprojet>(0);

	public Societe() {
	}

	public Societe(int idSociete) {
		this.idSociete = idSociete;
	}

	public Societe(int idSociete, String nomSociete, String adrSociete,
			String contactSociete, Set<Contratprojet> contratprojets) {
		this.idSociete = idSociete;
		this.nomSociete = nomSociete;
		this.adrSociete = adrSociete;
		this.contactSociete = contactSociete;
		this.contratprojets = contratprojets;
	}

	@Id
	@Column(name = "idSociete", unique = true, nullable = false)
	public int getIdSociete() {
		return this.idSociete;
	}

	public void setIdSociete(int idSociete) {
		this.idSociete = idSociete;
	}

	@Column(name = "nomSociete", length = 254)
	public String getNomSociete() {
		return this.nomSociete;
	}

	public void setNomSociete(String nomSociete) {
		this.nomSociete = nomSociete;
	}

	@Column(name = "adrSociete", length = 254)
	public String getAdrSociete() {
		return this.adrSociete;
	}

	public void setAdrSociete(String adrSociete) {
		this.adrSociete = adrSociete;
	}

	@Column(name = "contactSociete", length = 254)
	public String getContactSociete() {
		return this.contactSociete;
	}

	public void setContactSociete(String contactSociete) {
		this.contactSociete = contactSociete;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "societe")
	public Set<Contratprojet> getContratprojets() {
		return this.contratprojets;
	}

	public void setContratprojets(Set<Contratprojet> contratprojets) {
		this.contratprojets = contratprojets;
	}

}