package com.example.entities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name ="ABONNEMENT")
abstract class Abonnement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAbonnement;
	private String nomAbonnement;
	private Date dateAbonnement;
	private float solde;
	
	@OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	private Client prop;
	
	@OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, mappedBy = "abonnement")
	private List<Facture> factures = new ArrayList<>() ;
	
	
	public Abonnement() {
		super();
	}

	public Abonnement(String nomAbonnement, Date dateAbonnement, float solde, Client prop, List<Facture> factures) {
		super();
		this.nomAbonnement = nomAbonnement;
		this.dateAbonnement = dateAbonnement;
		this.solde = solde;
		this.prop = prop;
		this.factures = factures;
	}


	public Long getIdAbonnement() {
		return idAbonnement;
	}


	public void setIdAbonnement(Long idAbonnement) {
		this.idAbonnement = idAbonnement;
	}


	public String getNomAbonnement() {
		return nomAbonnement;
	}


	public void setNomAbonnement(String nomAbonnement) {
		this.nomAbonnement = nomAbonnement;
	}


	public Date getDateAbonnement() {
		return dateAbonnement;
	}


	public void setDateAbonnement(Date dateAbonnement) {
		this.dateAbonnement = dateAbonnement;
	}


	public float getSolde() {
		return solde;
	}


	public void setSolde(float solde) {
		this.solde = solde;
	}


	public Client getProp() {
		return prop;
	}


	public void setProp(Client prop) {
		this.prop = prop;
	}


	public List<Facture> getFactures() {
		return factures;
	}

	public void setFactures(List<Facture> factures) {
		this.factures = factures;
	}


	@Override
	public String toString() {
		return "Abonnement [idAbonnement=" + idAbonnement + ", nomAbonnement=" + nomAbonnement + ", dateAbonnement="
				+ dateAbonnement + ", solde=" + solde + ", prop=" + prop + ", lesFactures=" + factures
				+ ", factures=" + factures + "]";
	}


	
	
	
	

	
}
