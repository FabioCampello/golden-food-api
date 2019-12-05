package com.golden.food.api.service;

import org.springframework.stereotype.Component;

import com.golden.food.api.modelo.Cliente;
import com.golden.food.api.notificador.Notificador;

@Component
public class AtivacaoClienteService {
		
	private Notificador notificadorEmail;

	public AtivacaoClienteService(Notificador notificadorEmail) {
		this.notificadorEmail = notificadorEmail;
		System.out.println("AtivacaoClienteService: " + notificadorEmail);
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();

		this.notificadorEmail.notificar(cliente, "Seu cadastro no sistema está ativo.");
	}

}
