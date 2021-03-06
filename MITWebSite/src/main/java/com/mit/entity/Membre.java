package com.mit.entity;

// Generated 30 avr. 2016 14:36:04 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Membre generated by hbm2java
 */
@Entity
@Table(name = "membre", catalog = "mitdb")
public class Membre implements java.io.Serializable {

	private String idMembre;
	private Integer cin;
	private String password;
	private String email;
	private String nom;
	private String prenom;
	private String adr;
	private Integer tel;
	private Set<Contrat> contrats = new HashSet<Contrat>(0);
	private Set<Attestation> attestations = new HashSet<Attestation>(0);
	private Set<Tachemembre> tachemembres = new HashSet<Tachemembre>(0);

	public Membre() {
	}

	public Membre(String idMembre) {
		this.idMembre = idMembre;
	}

	public Membre(String idMembre, Integer cin, String password, String email,
			String nom, String prenom, String adr, Integer tel,
			Set<Contrat> contrats, Set<Attestation> attestations,
			Set<Tachemembre> tachemembres) {
		this.idMembre = idMembre;
		this.cin = cin;
		this.password = password;
		this.email = email;
		this.nom = nom;
		this.prenom = prenom;
		this.adr = adr;
		this.tel = tel;
		this.contrats = contrats;
		this.attestations = attestations;
		this.tachemembres = tachemembres;
	}

	@Id
	@Column(name = "idMembre", unique = true, nullable = false, length = 254)
	public String getIdMembre() {
		return this.idMembre;
	}

	public void setIdMembre(String idMembre) {
		this.idMembre = idMembre;
	}

	@Column(name = "cin")
	public Integer getCin() {
		return this.cin;
	}

	public void setCin(Integer cin) {
		this.cin = cin;
	}

	@Column(name = "password", length = 254)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "email", length = 254)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "nom", length = 254)
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "prenom", length = 254)
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Column(name = "adr", length = 254)
	public String getAdr() {
		return this.adr;
	}

	public void setAdr(String adr) {
		this.adr = adr;
	}

	@Column(name = "tel")
	public Integer getTel() {
		return this.tel;
	}

	public void setTel(Integer tel) {
		this.tel = tel;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "membre")
	public Set<Contrat> getContrats() {
		return this.contrats;
	}

	public void setContrats(Set<Contrat> contrats) {
		this.contrats = contrats;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "membre")
	public Set<Attestation> getAttestations() {
		return this.attestations;
	}

	public void setAttestations(Set<Attestation> attestations) {
		this.attestations = attestations;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "membre")
	public Set<Tachemembre> getTachemembres() {
		return this.tachemembres;
	}

	public void setTachemembres(Set<Tachemembre> tachemembres) {
		this.tachemembres = tachemembres;
	}

}
