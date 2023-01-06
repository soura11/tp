package com.example.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Facture {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFact;
	@Temporal(TemporalType.DATE)
	private Date dateFact;
	private float montant;
	private boolean reglee;
	
	@ManyToOne
	@JoinColumn(name = "id_abonnement", referencedColumnName = "id")
	private Abonnement abonnement;
	
	public Facture() {
		super();
	}

	public Facture(Date dateFact, float montant, boolean reglee, Abonnement abonnement) {
		super();
		this.dateFact = dateFact;
		this.montant = montant;
		this.reglee = reglee;
		this.abonnement = abonnement;
	}


	public Long getIdFact() {
		return idFact;
	}


	public void setIdFact(Long idFact) {
		this.idFact = idFact;
	}


	public Date getDateFact() {
		return dateFact;
	}


	public void setDateFact(Date dateFact) {
		this.dateFact = dateFact;
	}


	public float getMontant() {
		return montant;
	}


	public void setMontant(float montant) {
		this.montant = montant;
	}


	public boolean isReglee() {
		return reglee;
	}


	public void setReglee(boolean reglee) {
		this.reglee = reglee;
	}


	public Abonnement getAbonnement() {
		return abonnement;
	}


	public void setAbonnement(Abonnement abonnement) {
		this.abonnement = abonnement;
	}


	@Override
	public String toString() {
		return "Facture [idFact=" + idFact + ", dateFact=" + dateFact + ", montant=" + montant + ", reglee=" + reglee
				+ "]";
	}


	

	



}
