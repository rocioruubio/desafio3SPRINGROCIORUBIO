package com.example.desafio3SpringRRL.entities;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteDAOImpl implements ClienteDAOI {
	
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public Cliente add(Cliente c) {
		Session session = entityManager.unwrap(Session.class);
		session.save(c);
		session.close();
		return c;
	}

	@Override
	public Cliente edit(Cliente c) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(c);
		session.close();
		return c;
	}

	@Override
	public void deleteCliente(Cliente id) {
		Session session = entityManager.unwrap(Session.class);
		session.delete(id);
		session.close();
	}

}
