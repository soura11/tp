package com.example.entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ABONNEMENT_GSM")
public class AbonnementGSM extends Abonnement {

	private int fidelio;

	public AbonnementGSM() {
		super();
	}


	
	public AbonnementGSM(String nomAbonnement, Date dateAbonnement, float solde, Client prop, List<Facture> factures, int fidedlio, int fidelio) {
		super(nomAbonnement, dateAbonnement, solde, prop, factures);
		this.fidelio = fidelio;
		
	}




	public int getFidelio() {
		return fidelio;
	}


	public void setFidelio(int fidelio) {
		this.fidelio = fidelio;
	}


	@Override
	public String toString() {
		return "AbonnementGSM [fidelio=" + fidelio + ", toString()=" + super.toString() + "]";
	}


	

	
}
