package com.example.entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import antlr.collections.impl.Vector;


@Entity
@DiscriminatorValue("ABONNEMENT_FIXE")
public class AbonnementFixe extends Abonnement{

	private int debit;

	public AbonnementFixe() {
		super();
	}

	
	public AbonnementFixe(String nomAbonnement, Date dateAbonnement, float solde, Client prop, List<Facture> factures, int debit) {
		super(nomAbonnement, dateAbonnement, solde, prop, factures);
		this.debit = debit;
	}


	public int getDebit() {
		return debit;
	}


	public void setDebit(int debit) {
		this.debit = debit;
	}


	@Override
	public String toString() {
		return "AbonnementFixe [debit=" + debit + ", toString()=" + super.toString() + "]";
	}
	
	
	
		
	}
	
	




