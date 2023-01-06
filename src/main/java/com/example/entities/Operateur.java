package com.example.entities;

import java.text.ParseException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


class Operateur {

	public Client addClient(String n, String e, String tel, String v) throws ParseException {

	
		entityManager.getTransaction().begin();

		Client client = new Client(n, e, tel, v);

		entityManager.persist(client);
		return addClient(n, e, tel, v);
	}
	
	
}