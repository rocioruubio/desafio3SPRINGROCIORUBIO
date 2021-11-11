package com.example.desafio3SpringRRL.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.desafio3SpringRRL.entities.Cliente;
import com.example.desafio3SpringRRL.repository.Repository;

@Service
public class ClienteServiceImpl implements ClienteServiceI {

	@Autowired
	Repository repository;
	
	@Override
	public Cliente add(Cliente c) {
		return repository.save(c);
	}

	@Override
	public Cliente edit(Cliente e) {
		return repository.save(e);
	}

	@Override
	public void deleteCliente(Long cliente) {
		repository.deleteById(cliente);
	}

	@Override
	public Cliente findByName(String nombre) {
		return repository.findByName(nombre);
	}

	@Override
	public Cliente findByApll(String apellidos) {
		return repository.findByApll(apellidos);
	}

	@Override
	public List<Cliente> findAll() {
		return repository.findAll();
	}

}
