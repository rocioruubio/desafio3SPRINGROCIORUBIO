package com.example.desafio3SpringRRL.entities;

import java.util.List;

public interface ClienteDAOI {
	public Cliente add(Cliente c);
	public Cliente edit(Cliente e);
	public void deleteCliente(Cliente id);
	
}
