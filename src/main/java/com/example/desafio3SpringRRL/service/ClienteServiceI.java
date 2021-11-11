package com.example.desafio3SpringRRL.service;

import java.util.List;

import com.example.desafio3SpringRRL.entities.Cliente;

public interface ClienteServiceI {
	public Cliente add(Cliente c);
	public Cliente edit(Cliente e);
	public void deleteCliente(Long id);
	public Cliente findByName(String nombre);
	public Cliente findByApll(String apellidos);
	public List<Cliente> findAll();

}
