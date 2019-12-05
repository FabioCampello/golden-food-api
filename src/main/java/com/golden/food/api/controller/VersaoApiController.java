package com.golden.food.api.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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

	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		
		Cliente joao = new Cliente("Joao", "joao@xyz.com", "8598565-8871");
		ativacaoClienteService.ativar(joao);
		
		return "Hello World!";
	}
	
}
