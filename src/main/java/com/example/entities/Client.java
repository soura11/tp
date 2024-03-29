package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idClient;
	private String nom;
	private String email;
	private String tel;
	private String ville;
	
	
	public Client() {
		super();
	}


	public Client(String nom, String email, String tel, String ville) {
		super();
		this.nom = nom;
		this.email = email;
		this.tel = tel;
		this.ville = ville;
	}


	public Long getIdClient() {
		return idClient;
	}


	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", nom=" + nom + ", email=" + email + ", tel=" + tel + ", ville="
				+ ville + "]";
	}
	
	
	
	
}
