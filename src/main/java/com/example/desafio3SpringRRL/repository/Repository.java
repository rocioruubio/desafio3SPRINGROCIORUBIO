package com.example.desafio3SpringRRL.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.desafio3SpringRRL.entities.Cliente;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Cliente, Long> {
	
	@Query("select c from Cliente c where c.nombre=?1")
	Cliente findByName(String nombre);
	
	@Query("select c from Cliente c where c.apellidos=?1")
	Cliente findByApll(String apellidos);
}
