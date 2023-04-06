package com.desafio.ksi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.ksi.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
