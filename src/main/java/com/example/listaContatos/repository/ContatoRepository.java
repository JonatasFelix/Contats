package com.example.listaContatos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.listaContatos.model.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long>{

}
