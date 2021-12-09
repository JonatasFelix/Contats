package com.example.listaContatos.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.listaContatos.model.Contato;
import com.example.listaContatos.repository.ContatoRepository;


import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/agenda")
@CrossOrigin(origins = "*")
public class ContatoController {
	
	@Autowired
	private ContatoRepository cr;
	
	@GetMapping("/contatos")
	@ApiOperation(value = "Retorna todos os contatos")
	@ResponseStatus(HttpStatus.OK)
	
	public List<Contato> list(){
		return cr.findAll();
	}
	
	@GetMapping("/contatos/{id}")
	@ApiOperation(value = "Retorna um contato pelo ID")
	@ResponseStatus(HttpStatus.OK)
	public Optional<Contato> show(@PathVariable Long id){
		return cr.findById(id);
	}
	
	@PostMapping("/contatos")
	@ApiOperation(value = "Adiciona um contato")
	@ResponseStatus(HttpStatus.CREATED)
	public Contato create(@RequestBody Contato contato) {
	return cr.save(contato);
}
	
	
	
	

}
