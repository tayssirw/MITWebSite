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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Projet generated by hbm2java
 */
@Entity
@Table(name = "projet", catalog = "mitdb")
public class Projet implements java.io.Serializable {

	private Integer idProjet;
	private String titreProjet;
	private String descProjet;
	private Integer nbrTache;
	private Date dateDebut;
	private Date dateFin;
	private Set<Tache> taches = new HashSet<Tache>(0);
	private Set<Attestation> attestations = new HashSet<Attestation>(0);
	private Set<Contrat> contrats = new HashSet<Contrat>(0);

	public Projet() {
	}
	
	public Projet(String titreProjet, String descProjet,
			Integer nbrTache, Date dateDebut, Date dateFin) {
		super();
		
		this.titreProjet = titreProjet;
		this.descProjet = descProjet;
		this.nbrTache = nbrTache;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}


	public Projet(String titreProjet, String descProjet, Integer nbrTache,
			Date dateDebut, Date dateFin, Set<Tache> taches,
			Set<Attestation> attestations, Set<Contrat> contrats) {
		this.titreProjet = titreProjet;
		this.descProjet = descProjet;
		this.nbrTache = nbrTache;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.taches = taches;
		this.attestations = attestations;
		this.contrats = contrats;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idProjet", unique = true, nullable = false)
	public Integer getIdProjet() {
		return this.idProjet;
	}

	public void setIdProjet(Integer idProjet) {
		this.idProjet = idProjet;
	}

	@Column(name = "titreProjet", length = 254)
	public String getTitreProjet() {
		return this.titreProjet;
	}

	public void setTitreProjet(String titreProjet) {
		this.titreProjet = titreProjet;
	}

	@Column(name = "descProjet", length = 254)
	public String getDescProjet() {
		return this.descProjet;
	}

	public void setDescProjet(String descProjet) {
		this.descProjet = descProjet;
	}

	@Column(name = "nbrTache")
	public Integer getNbrTache() {
		return this.nbrTache;
	}

	public void setNbrTache(Integer nbrTache) {
		this.nbrTache = nbrTache;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dateDebut", length = 10)
	public Date getDateDebut() {
		return this.dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dateFin", length = 10)
	public Date getDateFin() {
		return this.dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "projet")
	public Set<Tache> getTaches() {
		return this.taches;
	}

	public void setTaches(Set<Tache> taches) {
		this.taches = taches;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "projet")
	public Set<Attestation> getAttestations() {
		return this.attestations;
	}

	public void setAttestations(Set<Attestation> attestations) {
		this.attestations = attestations;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "projet")
	public Set<Contrat> getContrats() {
		return this.contrats;
	}

	public void setContrats(Set<Contrat> contrats) {
		this.contrats = contrats;
	}

}
