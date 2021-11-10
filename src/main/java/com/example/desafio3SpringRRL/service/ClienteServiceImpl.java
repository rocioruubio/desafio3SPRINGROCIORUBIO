package com.example.desafio3SpringRRL.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.desafio3SpringRRL.entities.Cliente;
import com.example.desafio3SpringRRL.entities.ClienteDAOImpl;
import com.example.desafio3SpringRRL.repository.Repository;

@Service
public class ClienteServiceImpl implements ClienteServiceI {

	@Autowired
	Repository repository;
	
	@Autowired
	ClienteDAOImpl clientedaoimpl;
	
	@Override
	public Cliente add(Cliente c) {
		
		return clientedaoimpl.add(c);
	}

	@Override
	public Cliente edit(Cliente e) {
		return clientedaoimpl.edit(e);
	}

	@Override
	public void deleteCliente(Cliente id) {
		clientedaoimpl.deleteCliente(id);
	}

	@Override
	public Cliente findByName(String nombre) {
		return repository.findByName(nombre);
	}

	@Override
	public Cliente findByApll(String apellidos) {
		return repository.findByApll(apellidos);
	}

}
