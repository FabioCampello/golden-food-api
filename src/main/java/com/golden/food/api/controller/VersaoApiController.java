package com.golden.food.api.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.golden.food.api.modelo.Cliente;
import com.golden.food.api.service.AtivacaoClienteService;

@RestController
@CrossOrigin(origins = "*")
public class VersaoApiController {
	
	private AtivacaoClienteService ativacaoClienteService;
	
	public VersaoApiController(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
	}

	@GetMapping("/versao")
	public String recuparaVersao() {
		return "Versão: 0.0.1";
	}
	
	@GetMapping("/ativarCliente")
	public String ativarCliente(@RequestBody Cliente cliente) {
		Cliente joao = new Cliente(cliente.getNome(), cliente.getEmail(), cliente.getTelefone());
		return ativacaoClienteService.ativar(joao);
	}
	
}
