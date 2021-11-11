package com.example.desafio3SpringRRL.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.desafio3SpringRRL.entities.Cliente;
import com.example.desafio3SpringRRL.service.ClienteServiceImpl;

@Controller
public class ClienteController {
	
	@Autowired
	private ClienteServiceImpl clienteservice;
	
	@GetMapping("/")
	public String inicio() {
		return "inicio";
	}
	
	@GetMapping("/add")
	public String anadir(Model model) {
		model.addAttribute("clienteNuevo", new Cliente());
		return "anadir";
	}
	
	@PostMapping("/add/submit")
	public String submitAnadir(@Valid @ModelAttribute("clienteNuevo") Cliente aux, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "anadir";
		}else {
			clienteservice.add(new Cliente(aux.getId(), aux.getNombre(), aux.getApellidos(), aux.getFechaNacimiento(), aux.getDNI()));
			return "redirect:/list";
		}
	}
	
	@GetMapping("/list")
	public String listFilms(Model model) {
		model.addAttribute("cliente", clienteservice.findAll());
		return "listado";
	}
	
	@GetMapping("/delete")
	public String borrar(Model model) {
		model.addAttribute("idBorrar", new Long(0));
		return "listado";
	}
	
	@PostMapping("/delete/submit")
	public String submitBorrar(@RequestParam Long idBorrar) {
		clienteservice.deleteCliente(idBorrar);
		return "redirect:/list";
	}
	
	@GetMapping("/search/cliente/{nombre}")
	public String listName(Model model, @PathVariable String nombre) {
		model.addAttribute("cliente", clienteservice.findByName(nombre));
		return "listado";
	}

}
