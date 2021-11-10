package com.example.desafio3SpringRRL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.desafio3SpringRRL.entities.Cliente;
import com.example.desafio3SpringRRL.entities.ClienteDAOI;
import com.example.desafio3SpringRRL.service.ClienteServiceImpl;

@SpringBootApplication
public class Desafio3SpringRrlApplication implements CommandLineRunner {
	
	@Autowired
	public ClienteServiceImpl cliDaoimpl;
	

	public static void main(String[] args) {
		SpringApplication.run(Desafio3SpringRrlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Cliente cliente = new Cliente();
		cliente.setNombre("Rocio");
		cliente.setApellidos("Rubio Lado");
		cliente.setDNI("25608998A");
		cliente.setFechaNacimiento("17-02-2000");
		cliDaoimpl.add(cliente);
		
		System.out.println(cliDaoimpl.findByApll("Rubio Lado").getNombre());
		System.out.println(cliDaoimpl.findByName("Rocio").getApellidos());
		
	}

}
