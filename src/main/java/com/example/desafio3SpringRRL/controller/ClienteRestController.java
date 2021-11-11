package com.example.desafio3SpringRRL.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.desafio3SpringRRL.entities.Cliente;
import com.example.desafio3SpringRRL.repository.Repository;
import com.example.desafio3SpringRRL.service.ClienteServiceImpl;

@RestController
public class ClienteRestController {
	
	@Autowired
	private ClienteServiceImpl clienteservice;

	@GetMapping("/todosclientes")
    public List<Cliente> findAll(){
        return clienteservice.findAll();
    }
	
	@GetMapping(value = "/{nombre}")
	public Cliente getClienteById(final @PathVariable String nombre) {
		return clienteservice.findByName(nombre);
	}
	
	@PostMapping()
	public void addCliente(@RequestBody Cliente newCliente) {
		clienteservice.add(newCliente);
	}
	
	@GetMapping("/delete/{id}")
	public void deleteCliente(final @PathVariable Long id) {
		clienteservice.deleteCliente(id);
	}
}
