package com.desafio.ksi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.desafio.ksi.entity.Cliente;
import com.desafio.ksi.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository cr;
	
	public Cliente salvar(Cliente cliente) {
		return cr.save(cliente);
	}
	
	public List<Cliente> listarTodosCliente() {
		return cr.findAll();
	}
	
	public Optional<Cliente> buscarClientePorId(Long id) {
		return cr.findById(id);
	}
	
	public void deletarCliente(Long id) {
		cr.deleteById(id);
	}
}
